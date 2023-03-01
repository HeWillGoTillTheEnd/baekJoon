import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> number = new Stack<>();
        for(int i =0; i<K;i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0){
                number.add(num);
            } else number.pop();
        }
        int sum = 0;
        for(Integer s : number) sum += s;
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}
