import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        Map<String,Integer> stringMap = new HashMap<>();
        for(int i =0;i<M;i++){
            stringMap.put(br.readLine(), 0);
        }
        int count =0;
        for (int i = 0; i < N; i++) {
            if(stringMap.containsKey(br.readLine())) count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
