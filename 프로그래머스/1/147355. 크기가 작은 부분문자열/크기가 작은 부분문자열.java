class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String saveNum = "";
        long pNum = Long.parseLong(p);
        
        a:for(int i =0; i<t.length();i++){
            if(i+p.length() <= t.length()){
                for(int j=i;j<i + p.length();j++){
                    if(j > t.length()) continue a;
                    saveNum += String.valueOf(t.charAt(j));
                }
                if(Long.parseLong(saveNum) <= pNum) {
                    answer++;
                    saveNum = "";
                }
                else saveNum = "";
            }
        }
        return answer;
    }
}