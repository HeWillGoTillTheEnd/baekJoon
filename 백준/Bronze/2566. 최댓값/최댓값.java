import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        int max = 0;
        int hang = 1;
        int yeol = 1;
        for(int i =1;i<=9;i++){
            String s = br.readLine();
            String[] split = s.split(" ");
            for(int j = 1;j<=9;j++){
                int i1 = Integer.parseInt(split[j-1]);
                if(i1 > max) {
                    max = i1;
                    hang = i;
                    yeol = j;
                }
            }
        }
        bw.write(max + "\n");
        bw.write(hang + " " + yeol);
        bw.flush();
    }
}