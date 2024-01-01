class Solution {
    public int solution(int n) {
        int answer = 0;
        String threeReverse = "";
        //3을 나누고 나머지를 값을 해주면서 앞뒤반전값을 구한다
        while(n > 0){
            threeReverse += String.valueOf(n % 3);
            n /= 3;
        }
        answer = makeAnswer(threeReverse);
        //앞뒤반전으로 구한 값에 length-i만큼 3의 제곱을 해주며 10진수 값을 구한다.
        return answer;
    }
    
    static Integer makeAnswer(String s){
        Integer a = 0;
        String[] splitString = s.split("");
        for(int i =0;i<s.length();i++){
            a += making(splitString[i],splitString.length-i-1);
        }
        return a;
    }
    static Integer making(String s, Integer i){
        Integer result = 1;
        for(int j = 0;j < i;j ++){
            result *= 3;
        }
        result *= Integer.parseInt(s);
        return result;
    }
}