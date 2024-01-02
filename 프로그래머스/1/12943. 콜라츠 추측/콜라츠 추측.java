class Solution {
    public int solution(int num) {
        if(num == 1) return 0;
        long result = num;
        int counter = 0;
        //입력된 수가 짝수라면 2로 나눈다
        int answer = 0;
        while(result != 1){
            if(counter == 500) {
                answer = -1;
                break;
            }
            if(result % 2 == 0) {
                result /= 2;
                counter++;
            }
            else{
                result = (result * 3) + 1;
                counter++;
            }
        }
        if(counter >= 500) answer = -1;
        else answer = counter;
        return answer;
    }
}