class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        for(int i =0;i<n;i++){
            answer++;
            str = String.valueOf(answer);
            while(true){
                if(answer % 3 == 0) {
                    answer++;
                    str = String.valueOf(answer);
                    continue;
                }
                if(str.contains("3")) {
                    answer++;
                    str = String.valueOf(answer);
                    continue;
                }
                break;
            }
        }
        return answer;
    }
}