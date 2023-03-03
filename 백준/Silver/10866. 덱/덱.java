import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> deck = new ArrayList<>();
        for(int i =0;i<N;i++){
            String[] command = br.readLine().split(" ");
            if(command[0].equals("push_front")) {
                ArrayList<Integer> newDeck = pushFront(deck, Integer.parseInt(command[1]));
                deck = newDeck;
            } else if(command[0].equals("push_back")) deck.add(Integer.parseInt(command[1]));
            else if(command[0].equals("pop_front"))bw.write(popFront(deck)+"\n");
            else if(command[0].equals("pop_back"))bw.write(popBack(deck)+ "\n");
            else if(command[0].equals("size"))bw.write(deck.size()+"\n");
            else if(command[0].equals("empty"))bw.write(empty(deck)+"\n");
            else if(command[0].equals("front"))bw.write(front(deck)+"\n");
            else if(command[0].equals("back"))bw.write(back(deck)+"\n");
        }
        bw.flush();
    }
    static ArrayList<Integer> pushFront(ArrayList<Integer> deck,int x){
        if(deck.size() == 0) {
            deck.add(x);
            return deck;
        }
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(x);
        integers.addAll(deck);

        return integers;
    }
    static int popFront(ArrayList<Integer> deck){
        if(deck.size() == 0) return -1;
        Integer integer = deck.get(0);
        deck.remove(0);
        return integer;
    }
    static int popBack(ArrayList<Integer> deck){
        if(deck.size() == 0) return -1;
        Integer integer = deck.get(deck.size()-1);
        deck.remove(deck.size()-1);
        return integer;
    }
    static int empty(ArrayList<Integer> deck){
        if(deck.isEmpty()) return 1;
        else return 0;
    }
    static int front(ArrayList<Integer> deck){
        if(deck.size()==0) return -1;
        Integer integer = deck.get(0);
        return integer;
    }
    static int back(ArrayList<Integer> deck){
        if(deck.size()==0) return -1;
        Integer integer = deck.get(deck.size()-1);
        return integer;
    }
}
