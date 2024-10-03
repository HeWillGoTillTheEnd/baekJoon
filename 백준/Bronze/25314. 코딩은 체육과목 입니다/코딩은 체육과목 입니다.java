import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String N = bf.readLine(); //String
        int num = Integer.parseInt(N);
        int formun = num / 4;
        for(int i = 0; i<formun; i++) {
            bw.write("long ");
        }
        bw.write("int");
        bw.flush();
    }
}