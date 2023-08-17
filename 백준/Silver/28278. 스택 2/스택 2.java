import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> stack = new ArrayList<>();
        int result =0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if(command == 1) stack.add(Integer.parseInt(st.nextToken()));
            if(command == 2) {
                result = pop(stack);
                bw.write(result+"\n");
            }
            if(command == 3) {
                result = stack.size();
                bw.write(result+"\n");
            }
            if(command == 4) {
                result = isBlank(stack);
                bw.write(result+"\n");
            }
            if(command == 5) {
                result = get(stack);
                bw.write(result+"\n");
            }
        }
        bw.flush();

    }

    private static int get(ArrayList<Integer> stack) {

        if(stack.size() ==0) return -1;
        else  return stack.get(stack.size()-1);
    }

    private static int isBlank(ArrayList<Integer> stack) {
        if(stack.size() ==0) return 1;
        else return 0;
    }

    private static int pop(ArrayList<Integer> stack){
        int resuslt = 0;
        if(stack.size() ==0){
            resuslt = -1;
        }
        else {
            resuslt = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
        }
        return resuslt;
    }
}
