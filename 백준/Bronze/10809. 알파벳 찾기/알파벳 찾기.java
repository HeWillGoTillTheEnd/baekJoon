import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String s = br.readLine();
        int[] index = new int[26];
        for(int i = 0; i < index.length; i++) {
            if(index[i] == 0) index[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            int i1 = s.charAt(i) - 'a';

            if(index[i1] == -1) index[i1] = i;
        }
        for(int i = 0; i < index.length; i++) {
            bw.write(index[i] + " ");
        }
        bw.flush();

    }
}