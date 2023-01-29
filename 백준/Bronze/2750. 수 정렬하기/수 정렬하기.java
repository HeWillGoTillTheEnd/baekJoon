import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count =0;
        int[] intArr = new int[num];
        int save = intArr[0];
        for(int i = 0;i<num;i++){
            intArr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i<num;i++){
            for(int j=0;j<num;j++){
                if(j == num-1) break;
                if(intArr[j]>intArr[j+1]){
                    save = intArr[j+1];
                    intArr[j+1] = intArr[j];
                    intArr[j] = save;
                    count++;
                }
            }
            if(count == 0) break;
        }
        for(int i = 0; i<num;i++){
            bw.write(intArr[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
