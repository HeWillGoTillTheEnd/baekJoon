class Solution {
    public int solution(int n) {
        int answer = 0;
        int result = 1;
        if(n == 1) return 1;
        while(n >= (result* answer)){
            answer++;
            result *= answer;
        }
        return answer;
    }
}