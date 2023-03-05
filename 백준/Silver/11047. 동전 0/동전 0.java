import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int N = Integer.parseInt(a[0]);
        int K = Integer.parseInt(a[1]);
        int coinCount = 0;
        int[] coin = new int[N];
        for(int i=0;i<N;i++)coin[i] = Integer.parseInt(br.readLine());
        while(K!=0){
            if(coin[N-1]<=K) {
                K=K-coin[N-1];
                coinCount++;
            }
            if(coin[N-1]>K) N--;
        }
        bw.write(String.valueOf(coinCount));
        bw.flush();

    }
}
