import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int num = 0;
            if(n == -1) break;
            String result = n+" = ";
            for(int i =1; i<n;i++){
                if(n % i == 0) {
                    result += i;
                    num += i;
                    if(num < n) result += " + ";
                    else if(num == n) result += "\n";
                }
                if(num > n) {
                    result = n + " is NOT perfect.\n";
                    break;
                }
            }
            if(num <n) result = n + " is NOT perfect.\n";
            bw.write(result);
        }
        bw.flush();
        bw.close();
    }
}
