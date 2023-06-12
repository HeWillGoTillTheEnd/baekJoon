class Solution {
    public int solution(int n) {
        int count = 0;
        int answer = 0;
        while(count < n-1){
            count += 2;
            answer +=  count;
        }
        return answer;
    }
}