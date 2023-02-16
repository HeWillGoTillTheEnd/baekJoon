import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split(" ");
        int A = Integer.parseInt(a[0]);
        int B = Integer.parseInt(a[1]);
        int V = Integer.parseInt(a[2]);

        int result = (V-B)/(A-B);
        if((V-B)%(A-B) != 0) result++;

        bw.write(String.valueOf(result));
        bw.flush();
    }
}