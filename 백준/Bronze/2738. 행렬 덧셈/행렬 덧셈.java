import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String s = br.readLine();
        String[] split = s.split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        int[][] ints = new int[N][M];
        for(int i = 0; i < N; i++) {
            String s1 = br.readLine();
            String[] split1 = s1.split(" ");
            int[] ints1 = new int[M];
            for(int j = 0; j < ints1.length; j++){
                ints1[j] = Integer.parseInt(split1[j]);
            }
            ints[i] = ints1;
        }
        int[][] ints2 = new int[N][M];
        for(int i = 0; i < N; i++) {
            String s1 = br.readLine();
            String[] split1 = s1.split(" ");
            int[] ints1 = new int[M];
            for(int j = 0; j < ints1.length; j++){
                ints1[j] = Integer.parseInt(split1[j]);
            }
            ints2[i] = ints1;
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0;j< M; j++){
                bw.write((ints[i][j] + ints2[i][j])+ " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}