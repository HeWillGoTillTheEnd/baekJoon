class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int a =0;
        int result = -1;
        while(result != total){
            if(result <total) a++;
            else if(result > total) a--;
            result = 0;
            for(int i =0;i<num;i++){
                result += a+i;
            }
        }
        for(int i =0; i<num;i++){
            answer[i] = a+i;
        }
        return answer;
    }
}