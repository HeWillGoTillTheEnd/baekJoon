import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String,ArrayList<String>> info = new HashMap<>();
        Map<String,Integer> reportCount = new HashMap<>();
        for(int i =0;i<id_list.length;i++){
            info.put(id_list[i],new ArrayList<String>());
            reportCount.put(id_list[i], 0);
        }
        for(int i =0; i<report.length;i++){
            String[] split = report[i].split(" ");
            ArrayList<String> reportList = info.get(split[0]);
            if(reportList.contains(split[1])) continue;
            else {
                reportList.add(split[1]);
                info.put(split[0],reportList);
                int num = reportCount.get(split[1]);
                reportCount.put(split[1],num+1);
            }
        }
        int[] answer = new int[id_list.length];
        for(int i =0;i<id_list.length;i++){
            if(reportCount.get(id_list[i]) >= k){
                for(int j =0; j<answer.length;j++){
                    if(i == j) continue;
                    if(info.get(id_list[j]).contains(id_list[i]))
                        answer[j]++;
                }
            }
        }
        return answer;
    }
}