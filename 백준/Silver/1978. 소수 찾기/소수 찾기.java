import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int countSoSu = 0;
        String[] arr = br.readLine().split(" ");
        int[] intArr = new int[arr.length];
        a:
        for (int i = 0; i < count; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
            for (int j = 2; j < intArr[i]; j++) {
                if (intArr[i] % j == 0) continue a;
            }
            if (intArr[i] == 1) continue;
            countSoSu++;
        }
        bw.write(String.valueOf(countSoSu));
        bw.flush();
    }
}