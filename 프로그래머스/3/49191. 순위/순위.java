class Solution {
    static int[][] grade;
    public int solution(int n, int[][] results) {
        //정확하게 순위를 매기기 위해 필요한것?
        //내가 싸운 선수 + 나랑 싸운 선수와 싸운선수가 results에 있는 모두에 포함되어있어야함
        //2차원 int 배열 fight = new int [n+1][n+1];
        //
        //int winner = results[i][0];
        //int looser = result[i][1];
        //fight[winner][looser] = 1;
        //figth[looser][winner] = -1;
        // 0 0 0 0 0 0
        // 0 0 1 0 0 0
        // 0 2 0 2 2 1 
        // 0 0 1 0 2 0
        // 0 0 1 1 0 0
        // 0 0 2 0 0 0
        	//선수간의 결과 배열
        //1 = 승, -1 = 패, 0 = 모름
        //ex) grade[1][2] = 1 : 1번 선수가 2번선수에게 승
        grade = new int[n+1][n+1];
        for(int i=0;i<results.length;i++){
            int winner = results[i][0];
            int losser = results[i][1];
            
            grade[winner][losser] = 1;
            grade[losser][winner] = -1;
        }
        
        //k : 거쳐가는 선수
        for(int k = 1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                	//k선수를 거쳐서 비교했을때 i가 k를 이기고 k가 j를 이기면 i가 j를 이김
                    if(grade[i][k]==1 && grade[k][j]==1){
                        grade[i][j]=1;
                        grade[j][i]=-1;
                    }
                    //k선수를 거쳐서 비교했을때 i가 k에게 지고 k가 j에게 지면 j가 i를 이김
                    if(grade[i][k]==-1 && grade[k][j]==-1){
                        grade[i][j]=-1;
                        grade[j][i]=1;
                    }
                }
            }
        }
        //자기자신을 제외한 선수와의 결과가 0이 아니면 승부를 알수있음.
        int answer=0;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=n;j++){
                if(grade[i][j]==0){
                    count++;
                }
            }
            if(count==1) answer++;
        }
        return answer;
    }
}