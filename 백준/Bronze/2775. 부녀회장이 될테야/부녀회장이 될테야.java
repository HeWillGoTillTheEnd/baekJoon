import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] apartment = new int [15][15];
        for(int i = 0; i<15;i++) {
            apartment[i][0] = 1;
            apartment[0][i] = i+1;// i호는 1부터 시작하기 때문에 +1을 해줌
        }
        for(int i = 0; i<15; i++) {
            for(int j=0; j<15; j++){
                if(apartment[i][j] !=0) continue;
                apartment[i][j] = apartment[i][j-1] + apartment[i-1][j];
            }
        }
        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T;i++){
            int floor = Integer.parseInt(br.readLine());
            int hosu = Integer.parseInt(br.readLine()) -1; //위에서 호수는 0부터 시작하기 떄문에 -1을 해줌
            if(i != T-1) bw.write(apartment[floor][hosu]+ "\n");
            if(i == T-1) bw.write(String.valueOf(apartment[floor][hosu]));
        }
        bw.flush();
    }
}
