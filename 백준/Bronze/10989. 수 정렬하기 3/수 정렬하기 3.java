import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] countArr = new int[10001];
        int[] intArr = new int[count];
        for(int i = 0;i<count;i++){
            countArr[Integer.parseInt(br.readLine())]++;
        }
        for(int i =0; i <countArr.length;i++){
            while(countArr[i] != 0){
                bw.write(i+"\n");
                countArr[i]--;
            }
        }
        bw.flush();
        bw.close();
    }

}
