import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstNum = Integer.parseInt(br.readLine());
        int secondNum = Integer.parseInt(br.readLine());
        int sum = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        a:for (int i = firstNum; i <= secondNum; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) continue a;
            }
            if (i == 1) continue;
            ar.add(i);
        }
        for(int s : ar) sum += s;
        if(ar.size() == 0)bw.write(String.valueOf(-1));
        else bw.write(sum+"\n" + ar.get(0));

        bw.flush();
    }
}
