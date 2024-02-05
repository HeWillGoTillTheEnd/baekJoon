class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i =2; i <=n;i++){
            int count = 2;
            for(int j = 2;j<=Math.sqrt(i);j++){
                if(i % j == 0) {
                    count++;
                    break;
                }
            }
            if(count == 2) answer++;
        }
        return answer;
    }
}