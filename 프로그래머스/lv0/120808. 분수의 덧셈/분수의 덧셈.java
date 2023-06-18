class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        //일단 분모의 값을 맞춰준다
        //denom1과 denom2를 각각 서로의 값으로 곱해준다.곱한 값만큼 numer도 곱해준다.
        int denominator = denom1 * denom2;
        //분자를 더해준다
        int numerator = (numer1 *denom2) + (numer2 * denom1);
        //1과 자기자신을 제외하고 분자 분모가 함께 나누어지는 경우가 있다면 나눠준다
        a:while(true){
            for(int i =2;i<=denominator;i++){
                if(numerator % i == 0 && denominator % i == 0) {
                    numerator /= i;
                    denominator /= i;
                    continue a;
                }
            }
            for(int i =2;i<=numerator;i++){
                if(numerator % i == 0 && denominator % i == 0) {
                    numerator /= i;
                    denominator /= i;
                    continue a;
                }
            }
            break;
        }
        int[] answer = {numerator,denominator};
        
        //없을때까지 나누는 것을 반복한다
        //값을 반환한다
        return answer;
    }
}