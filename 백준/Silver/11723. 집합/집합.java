import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<N;i++){
            String[] st = br.readLine().split(" ");
            if(st[0].equals("add")) list.add(Integer.parseInt(st[1]));
                else if(st[0].equals("remove")) remove(Integer.parseInt(st[1]),list);
                else if(st[0].equals("check")) bw.write(check(Integer.parseInt(st[1]),list)+"\n");
                else if(st[0].equals("toggle")) toggle(Integer.parseInt(st[1]),list);
                else if(st[0].equals("all"))  list = all();
                else if(st[0].equals("empty")) list.clear();
            }
        bw.flush();
        }
    static void remove(int i,List<Integer> list){
        if(list.contains(i)) list.remove((Integer)i);
    }
    static int check(int i, List<Integer> list){
        if(list.contains(i)) return 1;
        else return 0;
    }
    static void toggle(int i, List<Integer> list){
        if(list.contains(i)) list.remove((Integer) i);
        else list.add(i);
    }
    static List<Integer> all(){
        List<Integer> newList = new ArrayList<>();
        for(int i =1; i<=20;i++) newList.add(i);
        return newList;
    }
}