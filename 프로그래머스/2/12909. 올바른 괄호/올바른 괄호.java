import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> bucket = new Stack<Character>();
        boolean answer = true;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i) == '(') bucket.add(s.charAt(i));
            if(s.charAt(i) == ')') {
                if(bucket.size() == 0) {
                    return false;
                } else bucket.pop();
            }
        }
        if(bucket.size() != 0) return false;
        return answer;
    }
}