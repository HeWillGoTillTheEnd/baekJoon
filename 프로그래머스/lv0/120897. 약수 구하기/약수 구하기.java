class Solution {
    public int[] solution(int n) {
        int[] intArr = new int[10001];
        int count = 0;
        for(int i=1;i <=n;i++){
            if(n%i == 0) {
                intArr[count] = i;
                count++;
            }
        }
        int[] answer = new int[count];
        for(int i =0;i<count;i++){
            answer[i] = intArr[i];
        }
        return answer;
    }
}