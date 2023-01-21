import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] intArr = new int[9][9];
        int max = 0;
        int saveI = 0;
        int saveJ = 0;
        for(int i = 0;i<9;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0;j<9;j++){
                intArr[i][j] = Integer.parseInt(st.nextToken());
                if(i == 0&& j ==0) {
                    max = intArr[i][j];
                }
                if(max<=intArr[i][j]) {
                    max = intArr[i][j];
                    saveI = i+1;
                    saveJ = j+1;
                }
            }
        }
        bw.write(max+"\n"+saveI+" "+saveJ);
        bw.flush();
    }
}
