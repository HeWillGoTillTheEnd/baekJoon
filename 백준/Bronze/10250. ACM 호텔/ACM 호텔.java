import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    //T개의 시행횟수를 입력받음
        //  H호텔의 층수 0
        // W각층의 방수 1
        // N몇번째 손님 2
        //EX) 6 12 10 402호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0;i<T;i++) {
            String[] input = br.readLine().split(" ");
            int[] inputInt = new int[input.length];
            for(int j = 0; j<inputInt.length;j++){
                inputInt[j]= Integer.parseInt(input[j]);
            }
            int hosu =(inputInt[2]/inputInt[0])+1;
            int cheonsu = inputInt[2]%inputInt[0];

            //H/N = 손님이 묵는 방의 호수
            if (cheonsu == 0) {
                hosu --;
                cheonsu = inputInt[0];
            }
            if(hosu<10) bw.write(cheonsu+"0"+hosu+"\n");
            else bw.write(String.valueOf(cheonsu)+hosu+"\n");
            }
        bw.flush();
        }
        //H%N 은 층수
        //만약 H%N == 0 은 호수-1 층수는 H
    }
