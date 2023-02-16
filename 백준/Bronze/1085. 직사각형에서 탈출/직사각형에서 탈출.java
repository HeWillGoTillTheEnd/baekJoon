import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] intArr = new int[str.length];
        for(int i=0; i<str.length;i++) intArr[i] = Integer.parseInt(str[i]);

        int wMinusX = intArr[2]-intArr[0];
        int hMinusY = intArr[3]-intArr[1];

        intArr[2] = wMinusX;
        intArr[3] = hMinusY;
        Arrays.sort(intArr);
        bw.write(String.valueOf(intArr[0]));
        bw.flush();

    }
}
