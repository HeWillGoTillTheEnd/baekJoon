import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 1;
        int[] numArr = new int[10];
        for (int i = 0; i < 3; i++) {
            int N = Integer.parseInt(br.readLine());
            result = result* N;
        }
        String[] resultArr = String.valueOf(result).split("");
        for (int i = 0; i < resultArr.length; i++) numArr[Integer.parseInt(resultArr[i])]++;
        for (int i = 0; i < 10; i++) bw.write(numArr[i]+"\n");
        bw.flush();
        bw.close();
    }
}