import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] bucket = new int[N];
        for(int repeat =0; repeat<M;repeat++){
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int j = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int k = Integer.parseInt(stringTokenizer.nextToken());
            while(i!=j+1){
                bucket[i] = k;
                i++;
            }
        }
        for (int i : bucket) {
            bw.write(i + " ");
        }
        bw.flush();
    }
}
