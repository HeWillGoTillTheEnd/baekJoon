import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String s = br.readLine();
        String upperCase = s.toUpperCase();
        int[] spell = new int[26];
        for (int i = 0; i < upperCase.length(); i++){
            int num = upperCase.charAt(i) - 'A';
            spell[num]++;
        }
        int maxIndex = 0;
        int maxNum = 0;
        int maxCount = 0;
        for(int i = 0; i < spell.length; i++){
            if(spell[i] > maxNum){
                maxNum = spell[i];
                maxIndex = i;
            }
        }
        for(int i = 0; i < spell.length; i++){
            if(maxNum == spell[i]) maxCount++;
        }
        if(maxCount >= 2)bw.write("?");
        else bw.write(String.valueOf((char)(maxIndex + 'A')));
        bw.flush();
    }
}