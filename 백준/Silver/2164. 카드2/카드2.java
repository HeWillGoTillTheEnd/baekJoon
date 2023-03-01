import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> deck = new LinkedList<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1;i<=N;i++)deck.add(i);
        int save = 0;
        while(deck.size() != 1){
            deck.poll();
            save = deck.poll();
            deck.add(save);
        }
        bw.write(String.valueOf(deck.poll()));
        bw.flush();
    }
}
