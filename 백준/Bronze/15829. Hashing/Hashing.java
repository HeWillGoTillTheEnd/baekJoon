import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();
        int result = 0;
        for(int i =0;i<L;i++){
            result = result + (chars[i] - 96)*(int)Math.pow(31,i);
        }
        int hash = result % 1234567891;
        bw.write(String.valueOf(hash));
        bw.flush();
    }
}