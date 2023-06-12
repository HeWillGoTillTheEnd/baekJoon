class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int s : array){
            if(s> height) answer++;
        }
        return answer;
    }
}