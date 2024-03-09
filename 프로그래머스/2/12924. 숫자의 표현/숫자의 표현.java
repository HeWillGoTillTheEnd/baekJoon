class Solution {
    public int solution(int n) {
        int answer = 1;
        int count = 0;
        for(int i =1; i<n;i++){
            for(int j = i; j<n;j++){
                count += j;
                if(count == n) {
                    answer++;
                    break;
                } else if(count > n) break;
            }
            count = 0;
        }
        return answer;
    }
}