import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static long result = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] split = br.readLine().split(" ");
        long A = Integer.parseInt(split[0]);
        long B = Integer.parseInt(split[1]);
        counting(A,B,1);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    public static void counting(long A, long B,int count){
        if(A > B) return;
        if(A == B) {
            if( result < count) result = count;
            return;
        }

        for(int i =0; i<2;i++){
            if(i == 0) {
                long nextA = A;
                nextA *= 10;
                nextA++;
                counting(nextA,B,count+1);
            }
            if(i == 1){
                long nextA = A;
                nextA *= 2;
                counting(nextA,B,count+1);
            }
        }
    }
}