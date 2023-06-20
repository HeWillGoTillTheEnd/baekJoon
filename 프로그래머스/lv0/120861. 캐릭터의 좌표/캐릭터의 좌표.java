class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        //현재위치(0,0)을 설정해줌
        //맵은 홀수이기 때문에 맵 크기 / 2 +1이 현재위치
        
        int x = (board[0]+1)/2; // x좌표
        int y = (board[1]+1)/2; //y좌표
        int xP = 0;
        int yP = 0;
        //기준으로 keyinput 배열을 반복하며 맵의 크기를 벗어나지 않았는지 확인하며
        for(String s : keyinput){
            if(s.equals("left")) {
                if(xP-1 >(x*(-1))) xP--;
            }
            if(s.equals("right")) {
                if(xP+1 <x) xP++;
            }
            if(s.equals("up")){
                if(yP+1 <y) yP++;
            }
            if(s.equals("down")){
                if(yP-1 >(y*(-1))) yP--;
            }
        }
        //위치를 변경함
        
        int[] answer = {xP,yP};
        return answer;
    }
}