class Solution {
    public int solution(int n) {
            int answer = 0;
            for(int i =2; i<n;i++){
                    if(n%i !=0) continue;
                answer += i;
            }
            answer += n+1;
        if(n <= 1) return n;
            return answer;
    }
}