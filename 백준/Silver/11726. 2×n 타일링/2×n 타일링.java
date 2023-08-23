import java.io.*;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[1010];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        int recur = recur(n);
        bw.write(String.valueOf(recur));
        bw.flush();
    }
    static int recur(int i){
        if(i <=2) return dp[i];
        if(dp[i] != 0) return dp[i];
        else {
            dp[i] = recur(i-1) + recur(i-2);
            return dp[i] % 10007;
        }
    }
}
