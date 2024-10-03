import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String N = bf.readLine(); //String

        for(int i = 0;i< Integer.parseInt(N); i++){
            String AB = bf.readLine();
            String[] split = AB.split(" ");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);
            bw.write((A+B)+"\n");
        }

        bw.flush();

    }
}