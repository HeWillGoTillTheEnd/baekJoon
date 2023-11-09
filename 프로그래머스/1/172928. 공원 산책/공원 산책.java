class Solution {
    public int[] solution(String[] park, String[] routes) {
       String[][] matrix = new String[park.length][park[0].length()];
            int Y = 0;
            int X = 0;
            int nextY = 0;
            int nextX = 0;
            for(int i =0; i<park.length;i++){
                matrix[i] = park[i].split("");
                for(int j =0; j<matrix[i].length;j++){
                    if(matrix[i][j].equals("S")){
                        Y = i;
                        nextY = i;
                        X = j;
                        nextX = j;
                    }
                }
            }

            for(int i =0; i<routes.length;i++){
                String[] route = routes[i].split(" ");
                if(route[0].equals("N")) nextY -= Integer.parseInt(route[1]);
                if(route[0].equals("S")) nextY += Integer.parseInt(route[1]);
                if(route[0].equals("W")) nextX -= Integer.parseInt(route[1]);
                if(route[0].equals("E")) nextX += Integer.parseInt(route[1]);
                if(nextY < 0 || nextY >=matrix.length || nextX <0 || nextX >=matrix[0].length) {
                    nextX = X;
                    nextY = Y;
                    continue;
                }
                if(jangaemul(X, nextX, Y, nextY,matrix)){
                    nextX = X;
                    nextY = Y;
                    continue;
                }
                X = nextX;
                Y = nextY;
            }
            int[] answer = new int[2];
            answer[0] = Y;
            answer[1] = X;
            return answer;
        }
        boolean jangaemul(int X, int newX, int Y, int newY,String[][] matrix) {
            if (X < newX) {
                for (int i = X; i <= newX; i++) {
                    if (matrix[Y][i].equals("X")) return true;
                }
            } else {
                for (int i = newX; i <= X; i++) {
                    if (matrix[Y][i].equals("X")) return true;
                }
            }
            if (Y < newY) {
                for (int i = Y; i <= newY; i++) {
                    if (matrix[i][X].equals("X")) return true;
                }
            } else{
                for (int i = newY; i <= Y; i++) {
                    if (matrix[i][X].equals("X")) return true;
                }
            }
            return false;
        }
}