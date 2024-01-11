import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        //String, Integer[2]로 된 Map을 통해 입차할 경우 기록이 존재하는지 확인하고
        Map<String,Integer[]> carInfo = new HashMap<String,Integer[]>();
        for(int i =0; i<records.length;i++){
            String[] split = records[i].split(" ");
            String carNumber = split[1];
            String time = split[0];
            String InOrOut = split[2];
            if(InOrOut.equals("IN")) {
                Integer[] info = {0, 0, 0};
                if(carInfo.containsKey(carNumber)){
                    //기록이 없는 차량번호의 경우 String에 차량번호, Integer[0]에 입차 기록 등록
                    //기록이 있는 차량번호의 경우 Map에서 차량번호를 통해 값을 꺼내고 Integer[0]에 입차시간 등록
                    info = carInfo.get(carNumber);
                    info[2] = 0;
                }

                info[0] = makeInteger(time);
                carInfo.put(carNumber,info);
            } else{
                //출차 할 경우 Map에서 차량번호를 통해 값을 꺼내고 출차시간-Integer[0]을 통해 구해진 값을
                //Integer[1]에 등록(+= 사용)
                Integer[] info = carInfo.get(carNumber);
                info[1] += makeInteger(time) - info[0];
                info[2] = 1;
                carInfo.put(carNumber,info);
            }
        }

        //기록이 전부 끝날때까지 반복
        //Map을 키셋을 만들어서 정렬
        Set<String> carNumSet = carInfo.keySet();
        String[] carNumList = new String[carNumSet.size()];
        Iterator<String> iterator = carNumSet.iterator();
        int counter = 0;
        while (iterator.hasNext()){
            String next = iterator.next();
            carNumList[counter] = next;
            counter++;
        }
        Arrays.sort(carNumList);
        for (int i = 0; i < carNumList.length; i++) {
            String carNum = carNumList[i];
            Integer[] info = carInfo.get(carNumList[i]);
            if(info[2] == 0){
                info[1] += makeInteger("23:59") - info[0];
                info[2] = 1;
                carInfo.put(carNum,info);
            }
        }
        //키셋 사이즈만큼 int[] result배열 생성
        int[] result = new int[carNumList.length];
        for(int i =0; i<result.length;i++){
            //번호순으로 Integer[1] 값을 꺼내서 비용 산정 후 result에 순서대로 값 추가
            result[i] = makeTotalFee(fees,carInfo.get(carNumList[i])[1]);
        }
        //반환
        return result;
    }

    Integer makeInteger(String time){
        String[] hourAndMinute = time.split(":");
        Integer result = 0;
        result += Integer.parseInt(hourAndMinute[1]);
        result += (Integer.parseInt(hourAndMinute[0]) * 60);
        return result;
    }

    int makeTotalFee(int[] fees, Integer time){
        if(fees[0] >= time) return fees[1];
        else{
            double asd = ((double) (time - fees[0]) / fees[2]);
            return fees[1] + (int) (Math.ceil(asd) * fees[3]);
        }
    }
}