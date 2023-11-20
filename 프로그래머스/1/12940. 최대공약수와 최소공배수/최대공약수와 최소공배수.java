class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = GCD(n,m);
        answer[1] = n*m / answer[0];
        
        return answer;
    }
    
    int GCD(int n, int m){
        if(m == 0) return n;
        return GCD(m,n%m);
    }
}