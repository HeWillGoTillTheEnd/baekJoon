import java.util.*;

class Solution {
    public String solution(int a, int b) {
        //세기 숫자 계산
        //2000~ 2099는 6
        //연도 숫자 계산
        //연도의 끝 두자리를 4로 나눈 몫
        //16 / 4 = 4 
        //위 값에서 구한 몫을 연도의 끝 두자리와 더함
        //4 + 16 = 20
        //위에서 구한 값이 7보다 작으면 그 숫자가 연도 숫자이고 7보다 크면 7로 나눈 나머지가 연도 숫자
        // 20 % 7 = 6
        //연도 숫자는 6
        
        //월 숫자 계산
        //1월부터 0, 3 ,3 ,6, 1, 4 ,6 ,2 ,5 ,0 ,3 ,5 윤년일 경우 1월과 2월의 요일을 계산 할 때는 -1 필요
        //일 숫자 계산
        //해당 날짜를 일주일 날짜 수인 7로 나눈 나머지 계산
        //10월 15일 의 경우 15% 7 = 1;
        //요일 숫자 계산
        //세기숫자,연도숫자,달숫자,일숫자를 모두 더해서 7로 나눈 나머지
        //0이 일~ 6이 토
        String answer = "";
        int[] months = {0, -1, 2 ,3 ,6, 1, 4 ,6 ,2 ,5 ,0 ,3 ,5};
        int days = b % 7;
        int weekNum = (6+6 +months[a] +days) % 7;
        Map<Integer,String> weekString = new HashMap<Integer,String>();
        weekString.put(0,"SUN");
        weekString.put(1,"MON");
        weekString.put(2,"TUE");
        weekString.put(3,"WED");
        weekString.put(4,"THU");
        weekString.put(5,"FRI");
        weekString.put(6,"SAT");
        answer = weekString.get(weekNum);
        return answer;
    }
}