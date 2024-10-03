import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String AB = br.readLine();
        String[] split = AB.split(" ");
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        while(A != 0 && B != 0) {
            bw.write((A + B) + "\n");
            String N = br.readLine();
            split = N.split(" ");
            A = Integer.parseInt(split[0]);
            B = Integer.parseInt(split[1]);
        }
        bw.flush();
    }
}