class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] newNumList = new int[101];
        int count = 0;
        for(int s : numlist) if (s%n == 0) {
            newNumList[count] = s;
            count++;
        }
        int[] answer = new int[count];
        for(int i =0; i < answer.length;i++){
            answer[i] = newNumList[i];
        }
        return answer;
    }
}