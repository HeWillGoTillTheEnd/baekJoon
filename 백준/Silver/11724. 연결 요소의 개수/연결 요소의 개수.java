import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[][] matrix = new boolean[N+1][N+1];
        visited = new boolean[N+1];
        int answer = 0;
        for(int i =0; i< M;i++){
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            matrix[x][y] = true;
            matrix[y][x] = true;
        }
        for(int i = 1; i<=N;i++){
            if(!visited[i]) {
                dfs(i,matrix,N);
                answer++;
            }
        }
        bw.write(String.valueOf(answer));
        bw.close();
        br.close();
    }

    private static void dfs(int idx,boolean[][] matrix,int N) {
        visited[idx] = true;
        for(int i =1;i<=N;i++){
            if(!visited[i] && matrix[idx][i]){
                dfs(i,matrix,N);
            }
        }
    }
}