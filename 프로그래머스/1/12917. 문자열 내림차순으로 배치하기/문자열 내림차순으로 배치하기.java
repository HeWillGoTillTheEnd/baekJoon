class Solution {
    public String solution(String s) {
        String[] sArr = s.split("");
        String saveS = "";
        for(int i =0;i<s.length();i++){
            for(int j = 1; j<s.length();j++){
                if(sArr[j-1].charAt(0) < sArr[j].charAt(0)){
                    saveS = sArr[j-1];
                    sArr[j-1] = sArr[j];
                    sArr[j] = saveS;
                }
            }
        }
        String answer = "";
        for(String a : sArr){
            answer += a;
        }
        return answer;
    }
}