class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        boolean counting = false;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == ' ') {
                count = 0;
                answer += String.valueOf(s.charAt(i));
                continue;
            } else{
                if(count % 2 == 0) {
                    answer += String.valueOf(s.charAt(i)).toUpperCase();
                    count++;
                } else {
                    answer += String.valueOf(s.charAt(i)).toLowerCase();
                    count++;
                }
            }
        }
        return answer;
    }
}