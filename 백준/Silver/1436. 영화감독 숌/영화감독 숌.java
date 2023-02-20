import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int save = 0;
        for(int i =666;count !=0;i++){
            if(haveThreeSix(i)) {
                count--;
                save = i;
            }
        }
bw.write(String.valueOf(save));
        bw.flush();
    }
    static boolean haveThreeSix(int i){
        int count = 0;
        char[] chars = String.valueOf(i).toCharArray();
        for(char s: chars) {
            if(count == 3) return true;
            if(s != '6') count =0;
            else {
                count++;
            }
        }
        if(count == 3) return true;
        else return false;
    }
}
