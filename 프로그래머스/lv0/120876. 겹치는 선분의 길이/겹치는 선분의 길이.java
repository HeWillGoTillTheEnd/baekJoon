class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] line = new int[201];
        for(int i =0; i<3;i++){
            for(int j=lines[i][0];j<lines[i][1];j++){
                if(j <0) line[(j*(-1))+100]++;
                else line[j]++;
            }
        }
        for(int s : line){
            if(s>=2) answer++;
        }
        return answer;
    }
}