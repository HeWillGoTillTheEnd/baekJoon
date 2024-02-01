import java.util.*;

class Solution implements Comparator<String> {
    static int N = 0;
    public String[] solution(String[] strings, int n){
        N = n;
        ArrayList<String> a = new ArrayList<String>();
        for(int i =0; i<strings.length;i++){
            a.add(strings[i]);
        }
        Collections.sort(a, new Solution());
        String[] answer = new String[a.size()];
        for(int i = 0;i<a.size();i++){
            answer[i] = a.get(i);
        }
        return answer;
    }
    @Override
    public int compare(String p1, String p2) {
        if(p1.charAt(N) - p2.charAt(N) != 0) return p1.charAt(N) - p2.charAt(N);
        else {
            return p1.compareTo(p2);
        }
    }
}
