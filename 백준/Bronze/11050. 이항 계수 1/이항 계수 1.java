import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int result = factorial(N)/(factorial(K)*factorial(N-K));
        bw.write(String.valueOf(result));
        bw.flush();
    }
    static int factorial(int num){
        if(num == 0) return 1;
        return num * factorial(num-1);
    }
}
