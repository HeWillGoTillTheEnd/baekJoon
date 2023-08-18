class Solution {
    public int solution(int[][] sizes) {
        int Amax = 0;
        int Bmax = 0;
        for(int i =0; i<sizes.length;i++){
            if(sizes[i][0] < sizes[i][1]){
            int saveNum = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = saveNum;
            }
            if(Amax < sizes[i][0]) Amax = sizes[i][0];
            if(Bmax < sizes[i][1]) Bmax = sizes[i][1];
        }
        int answer = Amax * Bmax;
        return answer;
    }
}