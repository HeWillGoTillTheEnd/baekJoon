import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<people> peopleArrayList = new ArrayList<>();
        for(int i =0;i<N;i++) {
        String[] s = br.readLine().split(" ");
        peopleArrayList.add(new people(Integer.parseInt(s[0]),s[1]));
        }
        peopleArrayList.stream().sorted(Comparator.comparing(e-> e.age)).collect(Collectors.toList()).forEach(e-> System.out.println(e.age+" "+ e.name));
}
static class people{
    int age;
    String name;

    public people(int age, String name) {
        this.age = age;
        this.name = name;
        }
    }
}
