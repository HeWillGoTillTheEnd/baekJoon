class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        int secondMax = 0;
        int changer = 0;
        for(int s : numbers){
            if(max <= s) {
                max = s;
                if(secondMax < max){
                    changer = secondMax;
                    secondMax = max;
                    max = changer;
                }
            }
        }
        answer = max * secondMax;
        return answer;
    }
}