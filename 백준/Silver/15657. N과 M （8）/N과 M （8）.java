import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr;
    static ArrayList<Integer> al;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        al = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        arr = new int[M];
        for (int i = 0; i <N; i++) al.add(Integer.parseInt(st.nextToken()));
        al.sort(Integer::compareTo);
        recur(0,0);
        System.out.println(sb);
    }
    static void recur(int at,int depth){
        if(depth == M){
            for (int i : arr) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = at; i < N; i++) {
            arr[depth] = al.get(i);
            recur(i,depth+1);

        }
    }
}
