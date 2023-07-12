class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        answer = isSame(giwolgi(dots[0],dots[1]),giwolgi(dots[2],dots[3]));
        if(answer == 1) return answer;
        answer = isSame(giwolgi(dots[0],dots[2]),giwolgi(dots[1],dots[3]));
        if(answer == 1) return answer;
        answer = isSame(giwolgi(dots[0],dots[3]),giwolgi(dots[1],dots[2]));
        return answer;
    }
    double giwolgi(int[] first, int[] second){
        int xl = 0;
        int xs = 0;
        int yl = 0;
        int ys = 0;
        int xInc = 0;
        int yInc = 0;
        double result = 0;
        if(first[0] < second[0]){
            xl = second[0];
            xs = first[0];
        }else {
            xl = first[0];
            xs = second[0];
        }
        if(first[1] < second[1]){
            yl = second[1];
            ys = first[1];
        }else {
            yl = first[1];
            ys = second[1];
        }
        xInc = xl-xs;
        yInc = yl-ys;
        result = (double) xInc/yInc;
        return result;
    }
    int isSame(double x, double y){
        if(x ==y) return 1;
        else return 0;
    }
}