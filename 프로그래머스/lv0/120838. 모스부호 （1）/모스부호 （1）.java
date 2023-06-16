class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letterArr = letter.split(" ");
        String answer = "";
        for(int i = 0; i< letterArr.length;i++){
            for(int j=0;j<morse.length;j++){
                if(letterArr[i].equals(morse[j])){
                    answer += String.valueOf((char)(j + 'a'));
                }
            }
        }
        return answer;
    }
}