import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] str = br.readLine().split(" ");
            int[] intStr = new int[str.length];
            for(int i =0; i<str.length;i++) intStr[i] = Integer.parseInt(str[i]);
            if(intStr[0] == 0 && intStr[1] == 0 && intStr[2] ==0) break;
            Arrays.sort(intStr);
            if(Math.pow(intStr[0],2)+Math.pow(intStr[1],2) == Math.pow(intStr[2],2)) bw.write("right\n");
            else bw.write("wrong\n");
        }
        bw.flush();
    }
}
