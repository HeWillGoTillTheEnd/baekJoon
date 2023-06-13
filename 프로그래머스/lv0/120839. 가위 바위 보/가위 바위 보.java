class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i =0; i<rsp.length();i++){
            if(rsp.charAt(i) == 48) answer += "5";
            if(rsp.charAt(i) == 50) answer += "0";
            if(rsp.charAt(i) == 53) answer += "2";
        }
        return answer;
    }
}