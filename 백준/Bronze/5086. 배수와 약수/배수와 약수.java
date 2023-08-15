import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            if(first == 0 &&second == 0) break;
            if(second % first == 0) bw.write("factor\n");
            else if(first % second == 0) bw.write("multiple\n");
            else bw.write("neither\n");
        }

        bw.flush();
        bw.close();
    }
}