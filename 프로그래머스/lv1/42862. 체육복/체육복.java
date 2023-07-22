class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int haveReserve = 1;
        int notHaving = -1;
        int[] allPeople = new int[n];
        for(int i =0;i<lost.length;i++) allPeople[lost[i]-1] += notHaving;
        for(int i =0;i<reserve.length;i++) allPeople[reserve[i]-1] += haveReserve;
        for(int i =0;i<allPeople.length;i++) {
            if(allPeople[i] <= 0) continue;
            if(allPeople.length-1 == i){
                if(allPeople[i] == haveReserve){
                    if( allPeople[i-1] == notHaving) allPeople[i-1] += haveReserve;
                    }
                break;
            }
            if(i == 0){
                if(allPeople[i] == haveReserve) {
                    if( allPeople[i+1] == notHaving) allPeople[i+1] += haveReserve;
                }
                continue;
            }
            if(allPeople[i] == haveReserve) {
                if( allPeople[i-1] == notHaving){
                    allPeople[i-1] += haveReserve;
                    allPeople[i]--;
                    continue;
                }
                if( allPeople[i+1] == notHaving) {
                    allPeople[i+1] += haveReserve;
                    allPeople[i]--;
                }
            }
        }
        for(int s : allPeople){
            if(s >= 0) answer++;
        }
        return answer;
    }
}