import java.util.*;

class Solution {
    
    static int result;
    static boolean[] isBisited;
    
    public int solution(int[] d, int budget) {
        int result = 0;
        Arrays.sort(d);
        for(int i =0;i<d.length;i++){
            if(budget - d[i] >= 0){
                budget -= d[i];
                result++;
            } else return result;
        }
        return result;
    }
}