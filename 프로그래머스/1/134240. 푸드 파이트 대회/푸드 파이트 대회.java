class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i<food.length;i++){
            if(food[i] < 2) continue;
            if(food[i] % 2 == 1) food[i]--;
            int foodNum = food[i] / 2;
            for(int j = 0; j<foodNum;j++){
                answer += i;
            }
        }
        int num = answer.length();
        String postAnswer = "";
        for(int i =0;i<num;i++){
            postAnswer += answer.charAt(num-1-i);
        }
        answer += "0";
        answer += postAnswer;
        return answer;
    }
}