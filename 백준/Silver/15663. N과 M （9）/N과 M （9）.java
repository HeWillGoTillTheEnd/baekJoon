import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr;
    static ArrayList<Integer> al;
    static Set<String> as;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        as = new LinkedHashSet<>();
        visit = new boolean[N];
        al = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        arr = new int[M];
        for (int i = 0; i <N; i++) {
            int a = Integer.parseInt(st.nextToken());
            al.add(a);
        }
        al.sort(Integer::compareTo);
        recur(0);
        for (String a : as) {
            System.out.println(a);
        }
    }
    static void recur(int depth){
        if(depth == M){
            String s = "";
            for (int i : arr) {
                s += i + " ";
            }
            if(!as.contains(s)) {
                as.add(s);
                return;
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[depth] = al.get(i);
                recur(depth + 1);
                visit[i] = false;
            }
        }
    }
}
