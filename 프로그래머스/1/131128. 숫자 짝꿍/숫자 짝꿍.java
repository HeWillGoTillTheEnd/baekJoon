class Solution {
    public String solution(String X, String Y) {
        int[] xNum = new int [10];
        int[] yNum = new int [10];
        for(int i =0; i<X.length();i++){
            xNum[X.charAt(i) - '0']++;
        }
        
        for(int i =0; i<Y.length();i++){
            yNum[Y.charAt(i) - '0']++;
        }
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i =9;i>=0;i--){
            int min = Math.min(xNum[i],yNum[i]);
            for(int j =0; j <min;j++){
                // answer += String.valueOf(i);
                sb.append(i);
            }
        }
        answer = sb.toString();
        if(answer.isEmpty()) return "-1";
        while(answer.length() >= 2 && answer.charAt(0) == '0'){
            String answerTemp = "";
            for(int i =1; i<answer.length();i++){
                answerTemp += answer.charAt(i);
            }
            answer = answerTemp;
        } 
        return answer;
    }
}