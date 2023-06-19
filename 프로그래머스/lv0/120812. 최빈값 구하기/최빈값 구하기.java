class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int mode = 0;
        boolean isSame = false;
        //1002개짜리 배열만듬
        int[] intArr = new int[1002];
        //array의 원소를 해당 배열의 위치를 기준으로 개수를 추가해줌 ex) 1번 3개 -> 배열[1] = 3;
        for(int i =0;i<array.length; i++) {intArr[array[i]]++;}
        //최빈값을 구함 -> 추가로 최빈값을 구할경우 동일한 값이 있는지 여부를 false로 변경해주고
        //최빈값과 같은 값이 나올경우 동일한 값이 있는지 여부를 true로 변경해줌
        for(int i =0;i <intArr.length;i++){
            if(intArr[i] > mode) {
                answer = i;
                mode = intArr[i];
                isSame = false;
            } else if (intArr[i] == mode) isSame = true;
        }
        if(isSame) return -1;
        return answer;
    }
}