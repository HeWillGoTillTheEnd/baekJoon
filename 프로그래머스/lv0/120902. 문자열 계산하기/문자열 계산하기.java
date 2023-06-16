class Solution {
    public int solution(String my_string) {
        int answer = 0;
        boolean isPlus = true;
        String[] st = my_string.split(" ");
        for(int i =0;i<st.length;i++){
            if(st[i].equals("+")) {
                isPlus = true;
                continue;
            }
               else if(st[i].equals("-")) {
                   isPlus = false;
                   continue;
               }
            if(isPlus) answer += Integer.parseInt(st[i]);
            else answer -= Integer.parseInt(st[i]);
        }
        return answer;
    }
}