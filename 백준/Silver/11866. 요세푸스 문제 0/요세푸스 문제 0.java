import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int remove = K;
        ArrayList<Integer> saveResult = new ArrayList<>();
        Queue<Integer> intArr = new LinkedList<>();
        for (int i = 1; i <= N; i++) intArr.add(i);
        while(intArr.size()!=0){
            for(int i =0; i<K-1;i++){
                Integer b= intArr.poll();
                intArr.add(b);
            }
            saveResult.add(intArr.poll());
        }
        bw.write("<");
        for (Integer s : saveResult) {
            if (Objects.equals(s, saveResult.get(saveResult.size() - 1))) {
                bw.write(s + ">");
                break;
            }
            bw.write(s + ", ");
        }
        bw.flush();
    }
}
