import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> queue = new ArrayList<>();
        for(int i =0; i<N; i++){
            String[] str = br.readLine().split(" ");
            if(str[0].equals("push")) queue.add(Integer.parseInt(str[1]));
            else if(str[0].equals("pop")) bw.write(pop(queue)+"\n");
            else if(str[0].equals("size")) bw.write(queue.size()+"\n");
            else if(str[0].equals("empty")) bw.write(empty(queue)+"\n");
            else if(str[0].equals("front")) bw.write(front(queue)+"\n");
            else if(str[0].equals("back")) bw.write(back(queue)+"\n");
        }
        bw.flush();
    }
    static int pop(ArrayList<Integer> queue){
        if(queue.size()== 0) return -1;
        Integer result = queue.get(0);
        queue.remove(0);
        return result;
    }
    static int empty(ArrayList<Integer> queue){
        if(queue.isEmpty()) return 1;
        else return 0;
    }
    static int front(ArrayList<Integer> queue){
        if(queue.size()== 0) return -1;
        Integer result = queue.get(0);
        return result;
    }
    static int back(ArrayList<Integer> queue){
        if(queue.size()==0) return -1;
        Integer result = queue.get(queue.size() - 1);
        return result;
    }

}
