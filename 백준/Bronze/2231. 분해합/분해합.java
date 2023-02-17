import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i =0; i<N; i++){
            String[] numberArr = String.valueOf(i).split("");
            int number = i;
            for(int j=0;j<numberArr.length;j++){
                number = number + Integer.parseInt(numberArr[j]);
            }
            if(number == N) {
                result = i;
                break;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
