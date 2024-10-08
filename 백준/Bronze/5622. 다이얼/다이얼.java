import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        HashMap<String, Integer> phone = new HashMap<String, Integer>();
        phone.put("A", 2);
        phone.put("B", 2);
        phone.put("C", 2);
        phone.put("D", 3);
        phone.put("E", 3);
        phone.put("F", 3);
        phone.put("G", 4);
        phone.put("H", 4);
        phone.put("I", 4);
        phone.put("J", 5);
        phone.put("K", 5);
        phone.put("L", 5);
        phone.put("M", 6);
        phone.put("N", 6);
        phone.put("O", 6);
        phone.put("P", 7);
        phone.put("Q", 7);
        phone.put("R", 7);
        phone.put("S", 7);
        phone.put("T", 8);
        phone.put("U", 8);
        phone.put("V", 8);
        phone.put("W", 9);
        phone.put("X", 9);
        phone.put("Y", 9);
        phone.put("Z", 9);

        String dial = br.readLine();
        int result = 0;
        for(int i =0; i< dial.length(); i++){
            result += phone.get(String.valueOf(dial.charAt(i)))+ 1;
        }
        bw.write(String.valueOf(result));
        bw.flush();

    }
}