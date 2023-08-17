import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cardCase = new int[20_000_010];
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num <0) num = (num *-1) + 10_000_000;
            cardCase[num]++;
        }
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num <0) num = (num *-1) + 10_000_000;
            if(cardCase[num] == 1) bw.write(String.valueOf(1));
            else bw.write(String.valueOf(0));
            if(N-1 != i) bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}
