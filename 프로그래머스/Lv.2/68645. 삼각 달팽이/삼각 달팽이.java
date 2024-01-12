class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        //이차원 배열을 만든다
        int[][] triangle = new int[n][];
        //포문으로 triangle[i] = new int[i+1];
        for(int i =0; i<triangle.length;i++){
            triangle[i] = new int[i+1];
        }
        int depth = 0;
        int index = 0;
        int num = 1;
        if (n == 1) {
            int[] ints = new int[1];
            ints[0] = 1;
            return ints;
        }
        if (n == 2) {
            int[] ints = new int[3];
            ints[0] = 1;
            ints[1] = 2;
            ints[2] = 3;
            return ints;
        }
        while(triangle[depth][index] == 0){
            //depth, index 를 넣어서 만든다
            //좌하로 내려가기 -> depth가 triangle.length거나 값이 0이 아닐때까지
            while(depth < triangle.length && triangle[depth][index] == 0){
                triangle[depth][index] = num;
                num++;
                depth++;
            }
            depth--;
            index++;
            //우측이동 -> index가 triangle[depth].length거나 값이 0이 아닐때까지
            while(index < triangle[depth].length && triangle[depth][index] == 0){
                triangle[depth][index] = num;
                num++;
                index++;
            }
            //좌상 이동 -> 값이 0이 아닐때 까지
            depth--;
            index -= 2;
            while(triangle[depth][index] == 0){
                triangle[depth][index] = num;
                num++;
                depth--;
                index--;
            }
            depth += 2;
            index++;
        }
        //반복
        //세번다 움직임이 없을 경우 루프 탈출
        //스트림에 있는 플랫맵 써도 되고 아니면 그냥 반환
        int totalSize = 0;
        for(int i =1; i<=n;i++){
            totalSize += i;
        }
        int[] result = new int[totalSize];
        int count = 0;
        for(int i =0; i<triangle.length;i++){
            for(int j = 0; j<triangle[i].length;j++){
                result[count] = triangle[i][j];
                count++;
            }
        }

        return result;
    }
}