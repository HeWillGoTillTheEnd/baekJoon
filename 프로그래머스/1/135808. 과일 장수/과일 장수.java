import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        //사과 m개씩 포장
        // 사과중 가장 낮은 점수가 p(1 <= p <k)점인 경우, 사과 한 상자의 가격은 p * m
        int answer = 0;
        Arrays.sort(score);
        //역순으로 담으면서 마지막에 가격이 책정되었을 때 가격 * 갯수를 answer에 값을 더해줌
        for(int i = score.length; i >= m; i -= m){
            //i는 배열의 길이, i가 m과 크거나 같을때까지, i에서 m만큼 빼면서진행
            answer += score[i - m] * m;
            //answer에 score[score.length- m(수량)] 한 값에 m(개수)만큼 곱해준다.
        }
        
        return answer;
    }
}