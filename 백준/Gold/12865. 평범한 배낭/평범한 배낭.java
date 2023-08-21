import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N,K, result;
    static int[][] arr;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N][2];
        dp = new int[100001][N];

        result = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            arr[i][0] = weight;
            arr[i][1] = value;
        }

        int recur = recur(0, 0);
        bw.write(String.valueOf(recur));
        bw.flush();
    }
    static int recur(int depth,int weight){
        if(weight >K) return -100010;
        if(depth == N) return 0;
        if(dp[weight][depth] != 0) {
            return dp[weight][depth];
        }
        dp[weight][depth] = Math.max(recur(depth + 1, weight + arr[depth][0]) + arr[depth][1], recur(depth + 1, weight));
        return dp[weight][depth];
        }
    }
