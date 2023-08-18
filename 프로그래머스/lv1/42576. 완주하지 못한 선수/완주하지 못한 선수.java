import java.util.HashMap;
import java.util.Map;


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> s1 = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            if(s1.containsKey(participant[i])){
                s1.replace(participant[i],s1.get(participant[i])+1);
                continue;
            }
            s1.put(participant[i],1);
        }
        for (int i = 0; i < completion.length; i++) {
            s1.replace(completion[i],s1.get(completion[i])-1);
            if(s1.get(completion[i]) == 0){
                s1.remove(completion[i]);
            }
        }
        for (String key : s1.keySet()) {
            answer=key;
        }
        return answer;
    }
}