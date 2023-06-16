class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String result = "";
        for(int s : array) result += String.valueOf(s);
        answer = result.length();
        int answer2 = result.replaceAll("7","").length();
        answer -= answer2;
        return answer;
    }
}