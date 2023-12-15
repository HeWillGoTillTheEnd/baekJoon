import java.util.*;

class Solution {
    
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> saveList = new ArrayList<Integer>();
        for(int i =0; i< numbers.length;i++){
            for(int j = i+1;j<numbers.length;j++){
                int saveNum = numbers[i]+numbers[j];
                if(saveList.contains(saveNum)) continue;
                else saveList.add(saveNum);
            }
        }
        answer = new int[saveList.size()];
        for(int i =0; i<saveList.size(); i++){
            answer[i] = saveList.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
    
}