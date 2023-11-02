class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int saveNum = 0;
        int counter = 0;
        //점수와 함께 3번의 기회로 구성된다
        //3번을 어떻게 나눌 것인가?
        //1S, 2D*, 3T
        //현재위치의 글자가 숫자가 아니고 다음위치의 글자가 숫자일경우
        String[] resultSplit = new String[3];
        for(int i =0; i<dartResult.length()-1;i++){
            char now = dartResult.charAt(i);
            char next = dartResult.charAt(i+1);
            if(!Character.isDigit(now) && Character.isDigit(next)){
                resultSplit[counter] = dartResult.substring(saveNum, i+1);
                saveNum = i+1;
                counter++;
            }
            if(counter == 2){
                resultSplit[counter] = dartResult.substring(saveNum, dartResult.length());
                break;
            }
        }
        int point = 0;
        int[] dart = new int[3];
        for(int i =0; i<3;i++){
            for(int j =0; j<resultSplit[i].length();j++){
                if(!Character.isDigit(resultSplit[i].charAt(j))){
                    point = Integer.parseInt(resultSplit[i].substring(0,j));
                    break;
                }
            }
            dart[i] =location(point, resultSplit[i]);
            prize(dart, resultSplit[i],i);
        }
        //점수계산
        for (int i : dart) {
            answer += i;
        }


        return answer;
    }

    private int[] prize(int[] dart, String s, int depth) {
        if(s.contains("#")) {
            dart[depth] = dart[depth] * (-1);
        } else if( s.contains("*")){
            dart[depth] = dart[depth] * 2;
            if(depth != 0) dart[depth-1] = dart[depth-1] * 2;
        }
        return dart;
    }

    private Integer location(Integer point,String location){
            if(location.contains("S")){
                return point;
            }
            else if(location.contains("D")){
                return point * point;
            }else {
                return point * point * point;
            }
    }
}