import java.io.*;
import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        a: for(int i =0; i<T;i++){
            Stack<String> testVps = new Stack<>();
            String[] str = br.readLine().split("");
            for(int j = 0; j<str.length;j++){
                if(Objects.equals(str[j], "(")) testVps.add(str[j]);
                else if(Objects.equals(str[j], ")")){
                    if(!testVps.isEmpty()) testVps.pop();
                    else {
                        bw.write("NO\n");
                        continue a;
                    }
                }
            }
            if(testVps.empty())bw.write("YES\n");
            else bw.write("NO\n");
        }
        bw.flush();
    }
}
