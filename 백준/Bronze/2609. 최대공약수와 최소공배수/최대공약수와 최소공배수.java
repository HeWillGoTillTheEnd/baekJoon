import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int GCD = hojebeob(one, two);
        int L = (one*two)/GCD;
        bw.write(GCD+"\n"+L);
        bw.flush();


    }
    static int hojebeob(int one, int two){
        if(one%two == 0) return two;
        int n = one%two;
        return hojebeob(two,n);
    }
}
