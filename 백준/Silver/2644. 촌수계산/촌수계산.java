import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static boolean[][] matrix;

    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        answer = -1;
        matrix = new boolean[n+1][n+1];
        visited = new boolean[n+1];
        for(int i =0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            matrix[x][y] = true;
            matrix[y][x] = true;
        }
        dfs(start,n,0,end);
        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int start,int n,int count,int end) {
        visited[start] = true;

        if(end == start) {
            answer = count;
            return;
        }
        for(int i = 1; i<=n;i++){
            if(!visited[i] && matrix[start][i]) {
                dfs(i,n,count+1,end);
            }
        }
    }
}
