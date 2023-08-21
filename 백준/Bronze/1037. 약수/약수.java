import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count =0;
        int result = 0;
        int max = 0;
        int min = 1_000_001;
        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
            if(arr.get(i) >max) max = arr.get(i);
            if(arr.get(i) < min) min = arr.get(i);
        }
        
        bw.write(String.valueOf(max *min));
        bw.flush();
    }
}
