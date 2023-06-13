class Solution {
    public String solution(int age) {
        String str = String.valueOf(age);
        String answer = "";
        for(int i=0;i<str.length();i++){
            answer += String.valueOf((char)(str.charAt(i)+'1'));
        }
        return answer;
    }
}