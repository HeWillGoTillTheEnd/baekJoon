import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        //성격 4개의 지표있음 2^4 = 16 개 나올 수 있음
        //점수가 동일할 경우 사전순으로 빠른 점수가 앞으로 옴
        //점수는 최대 7점 4는 동일하고 1로갈수록 앞의 문자에 +점수 뒤로갈수록 뒤의 문자에 +점수 최대 3점
        //만약 문자열 배열 A, N 에서 숫자가 4보다 크면 숫자 -4 숫자가 4보다 작거나 같으면 4-점수
        //문자열을 키값으로 점수를 밸류로 가지고 있는게 필요할듯?
        //그래서 최종적으로 문자열로 정렬한번해놓은걸 점수로 재정렬하면될듯
        //유형 -> R, T, C, F, J, M, A, N
        LinkedHashMap<String, Integer> type = new LinkedHashMap<>();
        //A = 1, C = 2, F = 3, J = 4, M = 5, N = 6, R = 7 T = 8
        //상반되는거가 점수가 같으면 항상 결정되는것이 고정되어있음
        type.put("R",0);
        type.put("C",0);
        type.put("J",0);
        type.put("A",0);
        type.put("T",0);
        type.put("F",0);
        type.put("M",0);
        type.put("N",0);
        
        for(int i =0; i<survey.length;i++){
            String[] surveySplit = survey[i].split("");
            Integer point = choices[i];
            String typeDetail = "";
            if(point > 4 ) {
                typeDetail = surveySplit[1];
                point = point - 4;
                point += type.get(typeDetail);
                type.put(typeDetail, point); 
            }
            else {
                typeDetail = surveySplit[0];
                point = 4 - point;
                point += type.get(typeDetail);
                type.put(typeDetail, point); 
            }
        }
        String answer = "";
        //R, T, C, F, J, M, A, N char 이용해서 그냥 넣어야겠다;
        //딱 8개만 존재해야함... ㅠ
        answer = sortMapByValue(type);
        //점수별로 정렬
        return answer;
    }
        public static String sortMapByValue(Map<String, Integer> map) {
            String answer = "";
        if(map.get("R") >= map.get("T")) {
            answer += "R";
        } else {
            answer+= "T";
        }
        if(map.get("C") >= map.get("F")) {
            answer += "C";
        } else {
            answer+= "F";
        }
                if(map.get("J") >= map.get("M")) {
            answer += "J";
        } else {
            answer+= "M";
        }
        if(map.get("A") >= map.get("N")) {
            answer += "A";
        } else {
            answer+= "N";
        }        
        return answer;
    }
}