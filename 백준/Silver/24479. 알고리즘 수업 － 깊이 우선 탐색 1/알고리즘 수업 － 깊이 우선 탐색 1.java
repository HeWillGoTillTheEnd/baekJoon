import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
    final static int MAX = 1000000 + 10;
    static boolean[] visited;
    static int[] answer;
    static int order;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];
        ArrayList<Integer>[] graph = new ArrayList[MAX];
        for(int i =0; i<=N;i++){
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[MAX];
        answer = new int[MAX];
        order = 1;

        for(int i =0; i<M;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        for(int i =1; i<=N;i++){
            Collections.sort(graph[i]);
        }
        dfs(R,graph);

        for(int i = 1; i<= N; i++){
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }
        bw.flush();

        bw.close();
        br.close();
    }

    private static void dfs(int idx,ArrayList<Integer>[] graph) {
        visited[idx] = true;
        answer[idx] = order;
        order++;

        for(int i =0; i<graph[idx].size();i++){
            int next = graph[idx].get(i);
            if(!visited[next]) dfs(next,graph);
        }
    }
}