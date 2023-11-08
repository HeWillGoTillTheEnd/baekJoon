import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i =0; i<photo.length;i++){
            answer[i] = pointing(name,yearning,photo[i]);
        }
        return answer;
    }
    Integer pointing(String[] name, int[] yearning, String[] photo){
        int point = 0;
        for(int i =0; i<photo.length;i++){
            point += checkPoint(name,yearning,photo[i]);
        }
        return point;
    }
    Integer checkPoint(String[] name, int[] yearning, String photo){
        int point = 0;
        for(int i =0; i<name.length;i++){
            if(photo.equals(name[i])) point = yearning[i];
        }
        return point;
    }
}