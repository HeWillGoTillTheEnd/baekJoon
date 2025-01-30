import java.io.*;
import java.util.Arrays;

public class Main {

    public static long result = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");
        int[] stick = new int[split.length];
        int totalStickLength = 0;
        for (int i = 0; i < n; i++) {
            //n개의 쇠막대가 필요
            stick[i] = Integer.parseInt(split[i]);
            totalStickLength += stick[i];
        }

        Arrays.sort(stick);
        int result = 0;
        for(int i = stick.length-1; i > 0; i--){
            totalStickLength -= stick[i];
            result += (totalStickLength * stick[i]);
        }
        bw.write(String.valueOf(result));
        //길이가 n^2인 쇠막대기가 존재
        // n개의 쇠막대기를 만들기
        // x+y인 막대를 x,y로 만들때는 두 막대의 길이의 곱인 xy의 비용이듬
        //최소의 비용으로 쇠막대를 잘라 n개의 쇠막대를 만들고 싶음
        //최소 비용을 계산하는 프로그램을 만들기
        // (1 ≤ n ≤ 500,000)
        //(1 ≤ ai ≤ 101)
        bw.flush();
        bw.close();
    }
}