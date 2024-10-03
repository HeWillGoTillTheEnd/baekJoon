import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String N = br.readLine(); //String
        int num = Integer.parseInt(N);
        for(int i = 0; i<num; i++) {
            String AB = br.readLine();
            String[] split = AB.split(" ");
            long A = Long.parseLong(split[0]);
            long B = Long.parseLong(split[1]);
            bw.write("Case #"+ (i+1) +": "+ A+" + "+B+" = " +(A + B) + "\n");
        }
        bw.flush();
    }
}