import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num = st.nextToken();
        int binary = Integer.parseInt(st.nextToken());
        int result  = 0;
        for(int i =0;i<num.length();i++){
            int thisNum = num.charAt(i);
            if(thisNum< 100 && thisNum>64) thisNum = thisNum -55;
            else thisNum = thisNum - 48;
            result = result + (thisNum * sqrt(binary,num.length()-(i+2)));
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
    public static int sqrt(int binary,int count){
        int result = binary;
        if(count <0) return 1;
        for(int i =0 ; i<count;i++){
            result = result * binary;
        }
        return result;
    }
}
