import java.util.*;

class Solution {
    public String solution(String s, int n) {
        //해시맵에 해답을 전부 박는다
        Map<String,String> result = new HashMap<String,String>();

        for(int i =0; i<26;i++){
            char word = (char)('A'+i);
            char password = (char) (word + n);
            if(password > 90) password -= 26;
            result.put(String.valueOf(word),String.valueOf(password));
        }
        for(int i = 0; i<26;i++){
            char word = (char) ('a'+i);
            char password = (char) (word + n);
            if(password > 122) password -= 26;
            result.put(String.valueOf(word),String.valueOf(password));
        }
        result.put(" "," ");
        String answer = "";
        //공백일 경우 스킵한다
        //문자를 해답으로 치환한다.
        //대문자일 경우 대문자 해답으로 치환한다
        //소문자일 경우 소문자 해답으로 치환한다
        for(int i =0; i<s.length();i++){
            answer += result.get(String.valueOf(s.charAt(i)));
        }
        return answer;
    }
}