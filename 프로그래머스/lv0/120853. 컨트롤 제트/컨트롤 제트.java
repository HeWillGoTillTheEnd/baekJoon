class Solution {
    public int solution(String s) {
        int answer = 0;
        int saveNum = 0;
        String[] strArr = s.split(" ");
        for(int i =0; i<strArr.length;i++){
            if(strArr[i].equals("Z")) answer -= saveNum;
            else {
                saveNum = Integer.parseInt(strArr[i]);
                answer += saveNum;
            }
        }
        return answer;
    }
}