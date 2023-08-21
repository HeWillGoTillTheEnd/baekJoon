import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N,T,P,result;
    static int[][] arr;
    static boolean[] visit;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        T = 0;
        P = 0;
        result = 0;
        arr = new int[N][2];
        dp = new int[N];
        visit = new boolean[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            arr[i][0] = t;
            arr[i][1] = p;
        }
        int recur = recur(0);
        bw.write(recur+"");
        bw.flush();

    }
    static int recur(int day){
        if(day == N) {
                return 0;
            }
        if(day > N) return -999999999;
        if (dp[day] != 0){
            return dp[day];
        }
        dp[day] = Math.max(recur(day + arr[day][0])+ arr[day][1], recur(day + 1));
        return dp[day];
    }
}
