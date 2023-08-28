import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] an = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int ai = Integer.parseInt(st.nextToken());
            an[i]  = ai;
        }
        int x = Integer.parseInt(br.readLine());
        int[] sortAn = Arrays.stream(an).sorted().toArray();

        int s = 0;
        int e = n - 1;
        int count = 0;
        while(s < e){
            //정답조건
            if(sortAn[s] + sortAn[e] == x) count++;
            if(sortAn[s] + sortAn[e] >= x) e--;
            else s++;
        }
        bw.write(count+"");
        bw.flush();
    }
}