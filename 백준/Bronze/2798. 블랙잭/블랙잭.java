import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] card = new int[N];
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i = 0; i<N;i++) card[i] = Integer.parseInt(str.nextToken());
        int result = 0;
        a:for(int i =0; i<N;i++){
            for(int j =1; j<N;j++){
                for(int k =2; k<N;k++) {
                    if (i != j && j != k && k != i) {
                        if (result < card[i] + card[j] + card[k] && card[i] + card[j] + card[k] <= M) {
                            result = card[i] + card[j] + card[k];
                            if (result == M) break a;
                        }
                    }
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
