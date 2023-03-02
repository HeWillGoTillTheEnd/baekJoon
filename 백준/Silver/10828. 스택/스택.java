import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> stack = new ArrayList<>();
        for(int i =0; i<N;i++){
            String[] str = br.readLine().split(" ");
            if(str[0].equals("push")) stack.add(Integer.parseInt(str[1]));
            else if(str[0].equals("pop")) bw.write(pop(stack)+"\n");
            else if(str[0].equals("size")) bw.write(stack.size()+"\n");
            else if(str[0].equals("empty")) bw.write(empty(stack)+"\n");
            else if(str[0].equals("top")) bw.write(top(stack)+"\n");
            bw.flush();
        }
    }

    static int pop(ArrayList<Integer> stack){
        if(stack.size() ==0) return -1;
        Integer pop = stack.get(stack.size() - 1);
        stack.remove(stack.size()-1);
        return pop;
    }
    static int top(ArrayList<Integer> stack){
        if(stack.size()==0) return -1;
        Integer top = stack.get(stack.size() - 1);
        return top;
    }
    static int empty(ArrayList<Integer> stack){
        if(stack.isEmpty()) return 1;
        else return 0;
    }
}
