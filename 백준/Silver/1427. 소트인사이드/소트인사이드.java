import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] info = br.readLine().split("");
            int[] countArr = new int[10];
            for(int i = 0;i<info.length;i++){
                countArr[Integer.parseInt(info[i])]++;
            }
            for(int i =countArr.length-1; i >= 0 ;i--){
                while(countArr[i] != 0){
                    bw.write(String.valueOf(i));
                    countArr[i]--;
                }
            }
            bw.flush();
            bw.close();
        }
    }