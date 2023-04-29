class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        if(my_str.length() %n != 0){
            answer = new String[(my_str.length() / n)+ 1];
        } else {
            answer = new String[my_str.length() / n];
        }
        String saveString = "";
        for (int i = 1; i <=my_str.length(); i++) {
            saveString = saveString + my_str.charAt(i - 1);
            if (i % n == 0) {
                answer[(i / n) - 1] = saveString;
                saveString = "";
            }
            if(i == my_str.length() && my_str.length() %n != 0){
                answer[answer.length-1] = saveString;
            }
        }
        return answer;
    }
}