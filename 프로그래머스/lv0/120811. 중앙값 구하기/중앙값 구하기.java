class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int changer  =0;
        for(int i = 0; i<array.length;i++){
            for(int j = 1; j<array.length;j++){
                if(array[j-1] > array[j]){
                    changer = array[j-1];
                    array[j-1] = array[j];
                    array[j] = changer;
                }
            }   
        }
        answer = array[(array.length/2)];
        return answer;
    }
}