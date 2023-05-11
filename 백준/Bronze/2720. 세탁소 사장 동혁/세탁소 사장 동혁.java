import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] centCase = new int[4];
        int num =0;
        for(int i =0; i<T;i++){
            int C = Integer.parseInt(br.readLine());
            num = C/25;
            centCase[0] = num;
            C = C-(num*25);
            num = C/10;
            centCase[1] = num;
            C = C-(num*10);
            num = C/5;
            centCase[2] = num;
            C = C-(num*5);
            centCase[3] = C;
            bw.write(centCase[0] + " " + centCase[1]+ " " + centCase[2] + " " + centCase[3]+"\n");
            bw.flush();
        }

    }
}