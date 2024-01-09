class Solution {
        //static으로 0과 1을 넣을 수 있는곳을 만들고 거기다가 값을 ++해줌
    static int[] result = new int[2];
    public int[] solution(int[][] arr) {
        zip(arr);
        return result;
    }
    public void zip(int[][] arr) {
        //만약 입력된 배열의 사이즈가 1이면 리턴
        //근데 뭘 리턴해야하지?
        //해당 배열 내부에 있는 숫자를 리턴하자
        if(arr[0].length == 1) {
            result[arr[0][0]]++;
            return;
        }
        int saveInt = arr[0][0];
        boolean allNumberSame = true;
        
        //4등분 나누면서 체크하고 같으면 해당 result값에 ++하기
        //배열 4등분해서 나누기
        int half = arr.length / 2;
        int[][] lh = new int[half][half];
        int[][] rh = new int[half][half];
        int[][] ld = new int[half][half];
        int[][] rd = new int[half][half];
        for(int i =0;i<arr.length;i++){
            for(int j =0; j<arr[i].length;j++){
                if(allNumberSame && saveInt != arr[i][j]){
                    allNumberSame = false;
                }
        //4등분해서 압축을 해야함
        
        //절반이전, 절반 이전/ 절반이전, 절반이후/ 절반이후, 절반이전/절반이후, 절반이후
        //네가지 경계를 기반으로 값을 나눔
        //재귀...해야되겟지?
                if(i <half && j <half){
                    lh[i][j] = arr[i][j];
                }
                if(i >=half && j <half){
                    ld[i - half][j] = arr[i][j];
                }
                if(i <half && j >=half){
                    rh[i][j-half] = arr[i][j];
                }
                if(i >=half && j >=half){
                    rd[i-half][j-half] = arr[i][j];
                }
                
            }
        }
        //전체가 똑같으면 또 그대~~로 리턴 -> 모든값을 한번 체크하긴 해야함
        if(allNumberSame) {
            result[saveInt]++;
            return;
        }
        zip(lh);
        zip(ld);
        zip(rh);
        zip(rd);
    }
}