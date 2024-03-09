import java.util.*;

class Solution {
    public int[] solution(String s) {
        String a = s;
        String b = "";
        int zeroCount = 0;
        int changeCount = 0;
        //x의 모든 0을 제거
        //x의 길이를 c라고 하면 x를 c를 이진법으로 표현한 문자열로 바꿈
        while(a.length() != 1){
            for(int i =0; i<a.length();i++){
                if(a.charAt(i) == '0') {
                    zeroCount++;
                    continue;
                } else {
                    b += a.charAt(i);
                }
            }
            int lh = b.length();
            Stack<Integer> bucket = new Stack<Integer>();
            while(lh > 0){
                bucket.add(lh % 2);
                lh /= 2;
            }
            a = "";
            int fb = bucket.size();
            for(int i =0; i<fb;i++){
                a += String.valueOf(bucket.pop());
            }
            b = "";
            changeCount++;
        }
        int[] answer = {changeCount,zeroCount};
        return answer;
    }
}