import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> trucks = new LinkedList<>();
        for(int i =0; i< truck_weights.length;i++){
            trucks.add(truck_weights[i]);
        }
        Queue<Integer> bridge = new LinkedList<>();
        //우선 다리길이만큼 큐에 0을 넣어준다
        for(int i =0; i<bridge_length;i++){
            bridge.add(0);
        }
        //truck_weights의 size가 0이 아니라면 반복한다(while)
        while(trucks.size() != 0){
            //만약 다리의 무게가 다리를 건너는 트럭무게와
            //대기트럭 가장 앞의 트럭의 무게의 합보다 작고
            //다리에서 가장 처음 들어가는 자리가 0이 아닐경우
            int another = trucks.peek();
            bridge.poll();
            if(weightCheck(bridge,weight,another)){
                //대기트럭을 빼서 다리위에 추가해주고 값을 하나 출력한다.
                //1초 늘려준다
                int truck = trucks.poll();
                bridge.add(truck);
                answer++;
                //아니라면 0을 추가해주고 값을 하나 출력해준다
                //1초 늘려준다.
            } else {
                bridge.add(0);
                answer++;
            }
        }
        while(bridge.size() != 0){
            bridge.poll();
            answer++;
        }
        return answer;
    }

    public boolean weightCheck(Queue<Integer> queue,int weight,int another){
        int sum = another;
        for(int q : queue){
            sum += q;
        }
        if(weight < sum) return false;

        return true;
    }
}