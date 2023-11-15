import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> answerArray = new ArrayList<>();
        //일단 명예의 전당 배열만들기
        LinkedList<Integer> hallOfHonor = new LinkedList<>();
        //기존에 명예의 전당은 정렬되어있는 배열이기 때문에
        //값과 값사이에 삽입만 해주면됨
        //LinkedList가 좀더 적합할 듯
        //일단 새로 들어가는 값이 들어갈 인덱스를 찾는다
        //찾으면 해당 인덱스에서 add 해준다
        
        //첫번째 값 등록
        hallOfHonor.add(score[0]);
        answerArray.add(score[0]);
        //k값 까지 다음과 같이 진행
        //가장 마지막에 있는 값을 answer에 추가
        //k까지 배열추가
        a: for(int i =1; i<k;i++){
            if(i==score.length) break;
            for(int j =0;j<hallOfHonor.size();j++){
                if(hallOfHonor.get(j) <score[i]){
                    hallOfHonor.add(j,score[i]);
                    answerArray.add(hallOfHonor.get(hallOfHonor.size()-1));
                    continue a;
                }
            }
            hallOfHonor.add(score[i]);    
            answerArray.add(score[i]);
        }
        a :for(int i =k; i<score.length;i++){
            for(int j =0;j<hallOfHonor.size();j++){
                if(hallOfHonor.get(j) <score[i]){
                    hallOfHonor.add(j,score[i]);
                    hallOfHonor.removeLast();
                    answerArray.add(hallOfHonor.get(hallOfHonor.size()-1));
                    continue a;
                }
            }    
            answerArray.add(hallOfHonor.get(hallOfHonor.size()-1));
        }
        int[] answer = new int[answerArray.size()];
        for(int i =0; i<answerArray.size();i++){
            answer[i] = answerArray.get(i);
        }
        return answer;
    }
}