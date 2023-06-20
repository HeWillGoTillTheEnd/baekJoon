class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        a:while(true){
            for(int i =2;i<=a;i++){
                if(a % i == 0 && b % i == 0){
                    a /= i;
                    b /= i;
                    continue a;
                }
            }
            break;
        }
        a:while(b != 1){
            for(int i =2;i<=b;i++){
                if(b % i ==0){
                    b /= i;
                    if(i == 2 || i == 5){
                        break;
                    } else {
                        answer = 2;
                        break a;
                    }
                }
            }
        }
        return answer;
    }
}