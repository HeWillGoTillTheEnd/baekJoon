class Solution {
    public int solution(int[] numbers, int k) {
        
        int answer = ((k-1)*2+1)%numbers.length;
        if(answer == 0) answer = numbers.length;
        return answer;
    }
}