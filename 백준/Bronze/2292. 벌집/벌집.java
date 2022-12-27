import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int door =1;
        int d = 0;
        if(N== 1) d = 1;
        while(N>door) {
            door = door + 6*d;
            d++;
        }
        bw.write(String.valueOf(d));
        bw.flush();
        bw.close();
    }
}