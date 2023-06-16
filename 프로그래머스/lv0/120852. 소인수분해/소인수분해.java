class Solution {
    public int[] solution(int n) {
        int[] answer = new int[10001];
        int count = 0;
        for(int i =2;n !=1;i++){
            while(n % i == 0){
                n /= i;
                if(answer[i] == 0) count++;
                answer[i]++;
            }
        }
        int[] newAnswer = new int[count];
        count = 0;
        for(int i =0;i<10001;i++){
            if(answer[i] != 0) {
                newAnswer[count] = i;
                count++;
            }
        }
        return newAnswer;
    }
}