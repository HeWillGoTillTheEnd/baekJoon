import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[N+ 1];
        boolean[][] graph = new boolean[N + 1][N + 1];
        for(int i =0; i<M;i++){
            int[] jeongBo2 = new int[2];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = true;
            graph[b][a] = true;
        }

        int answer = dfs(1,visited,N,graph,0);

        bw.write(String.valueOf(answer - 1));

        br.close();
        bw.close();
    }

    private static int dfs(int idx,boolean[] visited,int N,boolean[][] graph,int answer) {
        visited[idx] = true;
        answer++;

        for(int i =1; i <= N; i++){
            if(!visited[i] && graph[idx][i]){
                answer = dfs(i,visited,N,graph,answer);

            }
        }
        return answer;
    }
}