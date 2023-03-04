import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int realTime = 0;
        int haveTime = 0;
        int[] time = new int[1002];
        String[] people = br.readLine().split(" ");
        for(int i =0; i<N;i++){
            time[Integer.parseInt(people[i])]++;
        }
        for(int i =1; i<1002;i++){
            while(time[i]!=0) {
                realTime += i;
                time[i]--;
                haveTime += realTime;
            }
        }
        bw.write(String.valueOf(haveTime));
        bw.flush();
    }
}