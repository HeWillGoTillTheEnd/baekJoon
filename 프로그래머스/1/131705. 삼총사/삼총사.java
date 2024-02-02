import java.util.*;

class Solution {
    public int solution(int[] number) {
        ArrayList<Integer> choicedStudent = new ArrayList<>();
        int answer = 0;
        answer = choice(number,0,choicedStudent);
        return answer;
    }
    public int choice(int[] number,
                      int depth,
                      ArrayList<Integer> choicedStudent){
        if(choicedStudent.size() == 3){
            int result = 0;
            for(Integer num : choicedStudent){
                result += num;
            }
            if(result == 0) return 1;
            else return 0;
        }
        int answer = 0;

        for(int i =depth;i<number.length;i++){
            choicedStudent.add(number[i]);
            answer += choice(number,i+1,choicedStudent);
            choicedStudent.remove((Integer)number[i]);
        }
        return answer;
    }
}