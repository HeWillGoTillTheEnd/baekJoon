import java.io.*;
import java.util.Arrays;

public class Main {

    public static long result = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //자물쇠 -> N개의 다이얼, 각 다이얼에는 A부터 Z까지 알파벳 대문자가 차례대로 적혀있음
        //다이얼중 하나를 골라 1번 돌리는 작업을 할 수 있음
        // A였다면 B로 B였다면 C로... Z였다면 A로 변함 반대로는 못돌림
        // 작업을 K번 해 표시할 수 있는 문자열중 사전 순으로 가장 작은 것이 자물쇠의 비밀번호
        //무조건 가장 앞에게 가장 작을수록 높음
        //일단 배열의 가장 앞부터 A로 맞춰나감
        // 만약 현재 char + K가 'Z' 보다 클 경우 필요한 숫자 (K -= ('Z' - 현재 char)를 해주고 다음 숫자로 넘어간다
        //쭉쭉 반복
        //그담에 만약 K를 26으로 나눠주고, 남은 값을 맨 마지막 char값에 더한다

        String[] split = br.readLine().split(" ");

        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);
        char[] charArray = br.readLine().toCharArray();

        for (int i = 0; i < charArray.length && K > 0; i++) {
            if(charArray[i] == 'A') continue;
            if(charArray[i] + K > 'Z') {
                K -= (('Z' + 1) - (charArray[i]));
                charArray[i] = 'A';
            }
        }
        if(K > ('Z'-'A')) K %= 26;
        charArray[charArray.length-1] += K;
        for (char c : charArray) {
            bw.write(c);
        }

        bw.flush();
        bw.close();
    }
}