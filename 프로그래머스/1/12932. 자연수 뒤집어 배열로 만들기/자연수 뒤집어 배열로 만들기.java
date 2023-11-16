class Solution {
    public int[] solution(long n) {
        String a = String.valueOf(n);
        int[] answer = new int[a.length()];
        for(int i =0;i < answer.length;i++){
            answer[i] = a.charAt(answer.length-1-i) - '0';
        }
        
        return answer;
    }
}