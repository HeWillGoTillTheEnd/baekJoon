import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int result = 0;
        int zeroNum = 0;
        Set<Integer> winNumSet = new HashSet<>();
        for(int i =0; i<win_nums.length;i++){
            winNumSet.add(win_nums[i]);
        }
        for(int i =0; i<lottos.length;i++){
            if(lottos[i] == 0) {
                zeroNum++;
                continue;
            }
            if(winNumSet.contains(lottos[i])){
                result++;
            }
        }
        int max = result + zeroNum;
        int min = result;
        int maxRank = makePrizeRank(max);
        int minRank = makePrizeRank(min);
        //맵 안에 당첨 번호 넣기 -> 추첨한 값을 돌면서 포함하고 있으면 최소 answer값을 올려줌
        int[] answer = new int[2];
        answer[0] = maxRank;
        answer[1] = minRank;
        //0의 갯수를 저장해놓고 해당 저장 개수만큼 최소 answer값에 더해 최대 answer값을 만듦
        return answer;
    }
    
    public static int makePrizeRank(int num){
        if(num == 6) return 1;
        if(num == 5) return 2;
        if(num == 4) return 3;
        if(num == 3) return 4;
        if(num == 2) return 5;
        return 6;
    }
}