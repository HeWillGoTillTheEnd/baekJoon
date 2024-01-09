class Solution {
    
    static int[][] result;
    static int count = 0;
    public int[][] solution(int n) {
        int a = (int)Math.pow(2,n);
        result = new int[a-1][2];
        hanoi(n,1,3,2);
        return result;
    }

    void hanoi(int n,int start, int to, int via){
        if(n == 1){
            move(1, start, to);
        }
        else {
            hanoi(n-1, start, via, to);
            move(n, start, to);
            hanoi(n-1, via, to, start);
        }
    }
    
    void move(int n, int start, int to){
        result[count][0] = start;
        result[count][1] = to;
        count++;
    }
}