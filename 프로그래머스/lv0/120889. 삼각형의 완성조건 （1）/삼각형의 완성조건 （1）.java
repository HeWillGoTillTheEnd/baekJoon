class Solution {
    public int solution(int[] sides) {
        int result = 0;
        int changer = 0;
        for(int i =0; i <sides.length;i++){
            for(int j = 1;j<sides.length;j++){
                if(sides[j-1] > sides[j]){
                    changer = sides[j-1];
                    sides[j-1] = sides[j];
                    sides[j] = changer;
                }
            }
        }
        result = sides[0] + sides[1] -sides[2];
        int answer = 0;
        if(result >0) answer = 1;
        else answer = 2;
        return answer;
    }
}