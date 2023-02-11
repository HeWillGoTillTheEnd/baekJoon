import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int ascendingCount = 0;
        int descendingCount = 0;
        String[] s = br.readLine().split(" ");
        for(int i =0;i<s.length;i++){
            if(Integer.parseInt(s[i]) == i+1) ascendingCount++;
            if(Integer.parseInt(s[i]) == 8-i) descendingCount++;
        }
        if(ascendingCount == 8) bw.write("ascending");
        else if(descendingCount == 8) bw.write("descending");
        else bw.write("mixed");
        bw.flush();
    }
}
