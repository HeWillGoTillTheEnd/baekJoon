import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long[] forest = new long[N];
        long s = 0;
        long e = 0;
        for (int i = 0; i < forest.length; i++) {
            forest[i] = Integer.parseInt(st.nextToken());
            if(forest[i] > e) e = forest[i];
        }
        while(s <=e) {
            long result = 0;
            long mid = (s + e) / 2;
            for (long i : forest) {
                if(i >mid) result += i - mid;
            }
            if(result >= M)
                s = mid + 1;
            else e = mid - 1;
        }
        bw.write(String.valueOf(e));
        bw.flush();
    }
}
