import java.io.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ar = new ArrayList<>();
        int[] intArr = new int[5];
        int average = 0;
        int sum=0;
        int max = 0;
        int median = 0;
        int count = 0;
        for(int i = 0;i<5;i++){
            intArr[i] = Integer.parseInt(br.readLine());
            sum += intArr[i];
            ar.add(intArr[i]);
        }
        average = sum/5;
        for(int i = 0;i<3;i++){
            for(int s : ar){
                if(s>max) {
                    max = s;
                }
            }
            count++;
            if(count ==3 ) median = max;
            ar.remove((Integer) max);
            max = 0;
        }
        bw.write(average+"\n");
        bw.write(String.valueOf(median));
        bw.flush();
        bw.close();
    }
}
