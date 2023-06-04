import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int binary = Integer.parseInt(st.nextToken());
        String result = "";
        int binaryNum = 0;
        while(num != 0){
            binaryNum = num%binary;
            num = num/binary;
            if(binaryNum>9) {
                String binaryNumChar = String.valueOf((char)((char) binaryNum + 55));
                result = binaryNumChar + result;
            }else result = binaryNum + result;
        }
        bw.write(result);
        bw.flush();
    }
}
