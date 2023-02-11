import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;
        String[] s = br.readLine().split(" ");
        for(String sd : s){
            result = result+ (Integer.parseInt(sd) * Integer.parseInt(sd));
        }
        result = result % 10;
        bw.write(String.valueOf(result));
        bw.flush();
    }
}