import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] arr;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visit = new boolean[N];

        recur(N,M,0);
    }

    static void recur(int N,int M, int depth) {
       if( depth == M){
           for (int i : arr) {
               System.out.print(i + " ");
           }
           System.out.println();
           return;
       }

        for (int i = 0; i < N; i++) {
             if(!visit[i]){
                 visit[i] = true;
                 arr[depth] = i+1;
                 recur(N, M, depth + 1);
                 visit[i] = false;
             }

        }
    }
}
