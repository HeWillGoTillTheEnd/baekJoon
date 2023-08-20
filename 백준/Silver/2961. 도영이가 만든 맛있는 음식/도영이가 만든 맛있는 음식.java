import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int S, B,N,result;
    static int[][] arr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        visit = new boolean[N];
        S = 1;
        B = 0;
        result = 1_000_000_000;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int Sy = Integer.parseInt(st.nextToken());
            int By = Integer.parseInt(st.nextToken());
            arr[i][0] = Sy;
            arr[i][1] = By;
        }

        recur(0);
        System.out.println(result);

    }

    static void recur(int depth){
        if(depth == N){
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                S *= arr[i][0];
                B += arr[i][1];
                int i1 = S - B;
                if (i1 < 0) {
                    i1 = i1 * (-1);
                }
                if (i1 < result) result = i1;
                recur(i + 1);
                visit[i] = false;
                S /= arr[i][0];
                B -= arr[i][1];
            }
        }
    }
}
