import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long N = Integer.parseInt(br.readLine());
        long recur = recur(N);
        bw.write(String.valueOf(recur));
        bw.flush();
    }

    static long recur(long N){
        if(N == 0) return 1;
        else if(N ==1) return 1;
        return N * recur(N - 1);
    }
}
