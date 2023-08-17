import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       a:while (true) {
            String s = br.readLine();
            Stack<Character> check = new Stack<>();
            Stack<Character> close = new Stack<>();
            if (s.charAt(0) == '.') break;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[') {
                    check.push(s.charAt(i));
                } else if (c == ')') {
                    close.push(')');
                    {
                        if (!check.isEmpty()) {
                            if (check.get(check.size()-1) == '(') {
                                check.pop();
                                close.pop();
                            }
                        }
                    }
                } else if (c == ']') {
                    close.push(']');
                    if (!check.isEmpty()) {
                        if (check.get(check.size() - 1) == '[') {
                            check.pop();
                            close.pop();
                        }
                    }
                }
            }
            if(check.isEmpty() && close.isEmpty()) bw.write("yes\n");
            else bw.write("no\n");
            check.clear();
        }
        bw.flush();
    }
}
