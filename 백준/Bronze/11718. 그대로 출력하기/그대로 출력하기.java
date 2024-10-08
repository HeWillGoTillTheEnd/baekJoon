import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String tmp = "";
        while ((tmp = br.readLine()) != null) {
            bw.write(tmp +"\n");
        }
        bw.flush();
    }
}