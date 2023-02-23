import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> word = new HashSet<>();
        for(int i =0;i<N;i++) word.add(br.readLine());
        List<String> collect = new ArrayList<>(word).stream().sorted().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        for(String s : collect){
            bw.write(s+"\n");
        }
        bw.flush();
    }
}
