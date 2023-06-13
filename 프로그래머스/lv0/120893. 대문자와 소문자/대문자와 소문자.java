class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            char str = my_string.charAt(i);
            if(str >= 65 && str <= 90) answer += String.valueOf(str).toLowerCase();
            if(str >= 97 && str <= 122) answer += String.valueOf(str).toUpperCase();
        }
        return answer;
    }
}