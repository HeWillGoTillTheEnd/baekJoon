class Solution {
    public int solution(int[] numbers) {
        int answer = -100000001;
        int result = 0;
        for(int i =0; i<numbers.length-1;i++){
            for(int j =i+1; j<numbers.length;j++){
                result = numbers[i] * numbers[j];
                if(result > answer) answer = result; 
            }   
        }
        return answer;
    }
}