import java.io.*;

public class Main {
    static int[] fibonacci = new int[300];
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int result = dofibonacci(N);
        System.out.println(result);

    }
    static int dofibonacci(int n){
        fibonacci[1] = 1;
        if(n <=1) return fibonacci[n];
        fibonacci[n] = dofibonacci(n-1) + dofibonacci(n-2);
        return fibonacci[n];
    }
}