import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        //실패율
        //스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수/ 스테이지에 도달한 플레이어의 수
        //N = 전체 스테이지의 개수
        //stages 게임을 이용하는 사용자가 현재 멈춰있는 스테이지 번호
        //N+1은 마지막 스테이지까지 클리어한 사용자
        int[] stageClear = new int[502];
        int[] stageArrive = new int[502];
        List<double[]> failure = new ArrayList<>();
        for(int i =0;i<stages.length;i++){
            for(int j = 1; j<=stages[i];j++){
                stageClear[j]++;
            }
            // if(stages[i] == N+1) stageArrive[N]++;
            stageArrive[stages[i]]++;
        }
        for(int i =1; i<=N;i++){
            double[] dArr = new double[2];
            dArr[0] = i;
            if(stageArrive[i] == 0) dArr[1] = 0;
            else{
            dArr[1] = (double)stageArrive[i] / (double)stageClear[i];
            }
            System.out.println(dArr[1]);
            failure.add(dArr);
        }
        
        failure.sort((a,b)->Double.compare(b[1],a[1]));
        int[] answer = new int[N];
        for(int i = 0; i<answer.length;i++){
            answer[i] = (int)failure.get(i)[0];
        }
        return answer;
    }
}