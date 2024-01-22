import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] arr = s.replace("{","").replace("}","").split(",");
        //해시맵을 만들어서 int 값을 키로 하고 value를 0부터 시작해서 추가해준다(첨이면 추가 아니면 value++)
        HashMap<String,Integer> map = new HashMap<>();
        for(String num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num) + 1);
            } else{
                map.put(num,1);
            }
        }
        Set<String> set = map.keySet();
        int[] answer = new int[set.size()];
        for(int i = answer.length; i >= 1;i--){
            for(String a : set){
                if(map.get(a) == i){
                    answer[answer.length - i] = Integer.parseInt(a);
                }
            }
        }
        //첨으로 추가할때 해당 값을 ArrayList에 넣어준다. 이후에는 ArrayList에 존재하면 value++;
        //value가 가장 높은 값을 찾아서 --하며 1까지 value와 연결된 키 값을 찾아 배열에 담아준다.
        return answer;
    }
}