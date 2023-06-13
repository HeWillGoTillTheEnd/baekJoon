class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArr = my_string.toLowerCase().toCharArray();
        char changer = '1';
        for(int i =0; i <charArr.length;i++){
            for(int j =1; j <charArr.length;j++){
                if(charArr[j-1] >charArr[j]){
                    changer = charArr[j];
                    charArr[j] = charArr[j-1];
                    charArr[j-1] = changer;
                }
            }   
        }
        for(int i =0; i <charArr.length;i++){
            answer += charArr[i];
        }
        return answer;
    }
}