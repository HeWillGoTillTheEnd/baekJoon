import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String s = br.readLine();
        String a = s.replace("dz=", "A");
        String b = a.replace("c=", "B");
        String c = b.replace("c-", "C");
        String d = c.replace("d-", "D");
        String e = d.replace("lj", "E");
        String f = e.replace("nj", "F");
        String g = f.replace("s=", "G");
        String h = g.replace("z=", "H");
        bw.write(h.length()+"\n");
        bw.flush();
    }
}