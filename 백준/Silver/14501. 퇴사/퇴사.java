import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N,T,P,result;
    static int[][] arr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        T = 0;
        P = 0;
        result = 0;
        arr = new int[N][2];
        visit = new boolean[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            arr[i][0] = t;
            arr[i][1] = p;
        }
        recur(0,0);
        bw.write(result+"");
        bw.flush();

    }
    static void recur(int day,int price){
        if(day == N) {
            if (price > result){
                result = price;
                return;
            }
            return;
        }
        if(day > N) return;
        recur(day+ arr[day][0],price +arr[day][1]);
        recur(day+1,price);
    }
}
