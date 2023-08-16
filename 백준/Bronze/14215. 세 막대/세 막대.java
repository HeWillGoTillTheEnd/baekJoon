import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[3];
        int result = 0;
        num[0] = Integer.parseInt(st.nextToken());
        num[1] = Integer.parseInt(st.nextToken());
        num[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(num);
        if(num[2] < num[1] + num[0]) result = num[0] + num[1] + num[2];
        else result = (num[0] + num[1]) *2 -1;
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
