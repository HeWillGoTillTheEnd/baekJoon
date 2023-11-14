import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answerArray = new ArrayList<>();
        HashMap<String, Integer> hashTerms = new HashMap<>();
        String todayRemoveDots = today.replaceAll("\\.","");
        Integer intToday = Integer.parseInt(todayRemoveDots);
        for(int i = 0; i<terms.length;i++){
            String[] splitTerms = terms[i].split(" ");
            hashTerms.put(splitTerms[0],Integer.parseInt(splitTerms[1]));
        }
        for(int i = 0; i<privacies.length;i++){
            String[] splitPrivacies = privacies[i].split(" ");
            Integer Month = hashTerms.get(splitPrivacies[1]);
            String[] splitDate = splitPrivacies[0].split("\\.");
            Integer Year = Integer.parseInt(splitDate[0]);
            Month += Integer.parseInt(splitDate[1]);
            Integer Days = Integer.parseInt(splitDate[2]);
            if(Days == 1){
                Days = 28;
                if(Month == 1){
                    Year--;
                    Month = 11;
                } else{ Month--;
                }
            } else {
                Days--;
            }
            if(Month >12){
                if(Month % 12 == 0){
                    Year += (Month / 12) - 1;
                    Month = 12;
                } else {
                    Year += (Month / 12);
                    Month %= 12;
                }
            }
            String SYear = String.valueOf(Year);
            String SMonth = String.valueOf(Month);
            if(Month <10) {
                SMonth = "0"+SMonth;
            }
            String SDays = String.valueOf(Days);
            if(Days < 10) {
                SDays = "0"+ SDays;
            }
            String SDate = SYear + SMonth + SDays;
            Integer intDate = Integer.parseInt(SDate);
            if(intDate - intToday < 0) {
                answerArray.add(i+1);
            }
        }
        int[] answer = new int[answerArray.size()];
        for(int i = 0; i<answer.length;i++){
            answer[i] = answerArray.get(i);
        }
        return answer;
    }
}