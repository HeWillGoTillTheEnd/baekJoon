import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numeratorA = Integer.parseInt(st.nextToken());
        int denominatorA = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int numeratorB = Integer.parseInt(st.nextToken());
        int denominatorB = Integer.parseInt(st.nextToken());

        int numerator = 0;
        int denominator = 0;
        denominator = denominatorA * denominatorB;
        numerator = (denominatorA * numeratorB) + (denominatorB * numeratorA);
        boolean notEnd = true;
        a: while(notEnd){
            for (int i = 2; i <= numerator; i++) {
            if(denominator % i == 0){
                if(numerator % i ==0) {
                    denominator /= i;
                    numerator /= i;
                    continue a;
                }
            }
            }
            notEnd = false;
        }

        bw.write(numerator + " " + denominator);
        bw.flush();
        bw.close();
    }
}
