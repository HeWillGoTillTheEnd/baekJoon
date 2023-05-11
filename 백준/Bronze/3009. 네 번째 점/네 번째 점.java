import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");
        String[] C = br.readLine().split(" ");
        String[] D = new String[2];
        for(int i =0; i<2;i++){
            if(A[i].equals(B[i])) D[i] = C[i];
            else if(B[i].equals(C[i])) D[i] = A[i];
            else if(A[i].equals(C[i])) D[i] = B[i];
        }
        bw.write(D[0] +" "+ D[1]);
        bw.flush();
    }
}
