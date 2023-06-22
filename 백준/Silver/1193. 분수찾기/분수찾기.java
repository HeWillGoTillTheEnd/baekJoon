import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        int count = 1, prev_sum = 0;
        while(true) {
            if(S <= prev_sum + count){
                if (count % 2 == 1) {
                    bw.write((count - (S - prev_sum - 1)) + "/" + (S - prev_sum));
                    break;
                } else {
                    bw.write((S - prev_sum) + "/" + (count - (S - prev_sum - 1)));
                    break;
                }
            } else {
                prev_sum += count;
                count++;
            }
        }
        bw.flush();
    }
}