import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] bucket = new int[N];
        int saveNum = 0;
        for(int i=0; i<N;i++) bucket[i]= i+1;
        for(int repeat =0; repeat<M;repeat++){
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int j = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int k = Integer.parseInt(stringTokenizer.nextToken());
            int[] tail = Arrays.copyOfRange(bucket,k-1,j+1);
            int[] head = Arrays.copyOfRange(bucket,i,k-1);
            saveNum = tail.length;
            int countNum = 0;
            while(saveNum !=0){
                bucket[i] = tail[countNum];
                countNum++;
                i++;
                saveNum--;
            }
            countNum=0;
            saveNum = head.length;
            while(saveNum !=0){
                bucket[i] = head[countNum];
                countNum++;
                i++;
                saveNum--;
            }
        }
        for (int i : bucket) {
            bw.write(i + " ");
        }
        bw.flush();
    }
}