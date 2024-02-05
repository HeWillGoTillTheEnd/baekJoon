import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        ArrayList<String> alphabet = new ArrayList<>();
        for(int i =0; i<26;i++){
            char a = (char)('a' + i);
            alphabet.add(String.valueOf(a));
        }
        for(int i =0;i<skip.length();i++){
            alphabet.remove(String.valueOf(skip.charAt(i)));
        }
        for(int i =0; i<s.length();i++){
            int search = alphabet.indexOf(String.valueOf(s.charAt(i)));
            int searchIdx = search+index;
            if(search + index < alphabet.size()) answer += alphabet.get(searchIdx);
            else {
                while(searchIdx >= alphabet.size()){
                    searchIdx -= alphabet.size();
                }
                answer += alphabet.get(searchIdx);
            }
        }
        return answer;
    }
}