import java.io.*;
import java.util.StringTokenizer;

public class Main{
    static boolean[][] visited;
    static boolean[][] matrix;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            matrix = new boolean[N + 10][M + 10];
            visited = new boolean[N + 10][M + 10];
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                matrix[y + 1][x + 1] = true;
            }
            for(int i = 1; i<= N;i++){
                for(int j =1;j<= M;j++){
                    if(matrix[i][j] && !visited[i][j]){
                        dfs(i,j);
                        answer++;
                    }
                }
            }
            bw.write(answer+"\n");
            bw.flush();
            answer = 0;
        }
        bw.close();
        br.close();
    }

    private static void dfs(int y,int x) {
        visited[y][x] = true;

        if(!visited[y+1][x] && matrix[y+1][x]) dfs(y+1,x);
        if(!visited[y-1][x] && matrix[y-1][x]) dfs(y-1,x);
        if(!visited[y][x+1] && matrix[y][x+1]) dfs(y,x+1);
        if(!visited[y][x-1] && matrix[y][x-1]) dfs(y,x-1);
    }
}
