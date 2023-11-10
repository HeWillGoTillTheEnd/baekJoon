class Solution {
        static final int MAX_VALUE = 100001;
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int num = MAX_VALUE;
        int checknum = MAX_VALUE;
        int resultNum =0;
        for(int i = 0;i < targets.length;i++){
            for(int j =0;j < targets[i].length();j++){
                for(int k = 0; k < keymap.length;k++){
                    checknum = checkMap(keymap[k],targets[i].charAt(j));
                    if(checknum < num) num = checknum;
                }
                resultNum += num;
                num = MAX_VALUE;
            }
            if(resultNum >= MAX_VALUE) answer[i] = -1;
            else answer[i] = resultNum;
            resultNum = 0;
            num = MAX_VALUE;
            checknum = MAX_VALUE;
        }
        return answer;
    }
    int checkMap(String keymap, char target){
        int result = MAX_VALUE;
        for(int i = 0;i<keymap.length();i++){
            if(keymap.charAt(i) == target) {
                result = i;
                return result+1;
            }
        }
        return result;
    }
}