import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] an = new int[n];
        for (int i = 0; i < an.length; i++) {
            an[i] = Integer.parseInt(st.nextToken());
        }
        int[] sortedAn = Arrays.stream(an).sorted().toArray();
        int x = Integer.parseInt(br.readLine());
        int start = 0;
        int end = n - 1;
        int count = 0;
        while(start != end){
            if(sortedAn[start] + sortedAn[end] == x){
                count++;
                start++;
                continue;
            }
            if(sortedAn[start] + sortedAn[end] >x){
                end--;
                continue;
            }
            if(sortedAn[start] + sortedAn[end] < x) {
                start++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }

}
