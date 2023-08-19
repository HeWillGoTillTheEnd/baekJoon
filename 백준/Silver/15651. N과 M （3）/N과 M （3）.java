import java.io.*;
import java.util.StringTokenizer;

public class Main {
        static int N,M;
        static int[] arr;
    static StringBuilder sb = new StringBuilder();

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[M];
            recur(0);
            System.out.println(sb);
        }
    static void recur(int depth) {
            if(depth == M){
                for (int i : arr) {
                    sb.append(i+" ");
                }
                sb.append("\n");
                return;
            }

        for (int i = 0; i < N; i++) {
                arr[depth] = i+1;
                recur(depth+1);
            }
    }
}
