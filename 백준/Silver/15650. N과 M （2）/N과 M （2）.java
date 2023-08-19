import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visited = new boolean[N];
        recur(0);
    }
    static void recur(int depth){
        if(depth == M){
            if(check()) {
                String s = "";
                for (int i : arr) {
                    System.out.print(i+ " ");
                }
                System.out.println();
                return;
            }
            return;
        }
        for (int i = 0; i < N; i++) {
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i+1;
                recur(depth+1);
                visited[i] = false;
            }

        }
    }

    static boolean check(){
        int num =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(num > arr[i]) return false;
            num = arr[i];
        }
        return true;
    }
}
