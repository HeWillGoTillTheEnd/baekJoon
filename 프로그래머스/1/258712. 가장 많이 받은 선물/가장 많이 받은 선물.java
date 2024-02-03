import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        HashMap<String,Member> members = new HashMap<String,Member>();
        for(int i =0; i<friends.length;i++){
            members.put(friends[i],new Member(friends[i]));
        }
        for(String gift : gifts){
            String[] st = gift.split(" ");
            members.get(st[0]).addGive(st[1]);
            members.get(st[1]).addReceive(st[0]);
        }
        for(int i =0; i<friends.length;i++){
            Member now = members.get(friends[i]);
            for(int j = 0;j<friends.length;j++){
                if(now.name.equals(friends[j])) continue;
                Member choicedFriends = members.get(friends[j]);
                //두 사람이 선물을 주고받은 기록이 있다면, 이번 달까지 두 사람 사이에 더 많인 선물을 준 사람이 담달에 선물을 하나 받음
                int a = getGiveGift(now.give,choicedFriends.name);
                int b = getGiveGift(choicedFriends.give, now.name);
                if(a > b) now.result++;
                else if(a < b) choicedFriends.result++;
        //두 사람이 선물을 주고받은 기록이 하나도 없거나 주고받은 수가 같다면 선물 지수가 더 큰 사람이 선물 지수가 더 작은 사람에게 선물을 하나 받음
        //선물 지수 : 이번달까지 자신이 친구들에게 준 선물의 수에서 받은 선물의 수를 뺀 값
        //ex) A가 친구들에게 준 선물이 3개고 받은 선물이 10개라면 A의 선물 지수는 -7
        //두 사람의 선물지수도 같다면 담달에 선물을 주고받지 않음
                else {
                    if(now.calculateGiftFactor() > choicedFriends.calculateGiftFactor()) now.result++;
                    else if(now.calculateGiftFactor() < choicedFriends.calculateGiftFactor()) choicedFriends.result++;
                }
            }
        }
        int answer = 0;
        for(int i =0; i<friends.length;i++){
            Member m = members.get(friends[i]);
            if(m.result > answer) answer = m.result;
        }
        return answer / 2;
    }
    public int getGiveGift(ArrayList<String> give,String name){
        int result = 0;
        for(String s : give){
            if(s.equals(name)) result++;
        }
        return result;
    }
}
class Member{
    public String name;
    public ArrayList<String> give;
    public ArrayList<String> receive;
    public int result;
    
    public Member(String name){
        this.name = name;
        this.give = new ArrayList<String>();
        this.receive = new ArrayList<String>();
        this.result = 0;
    }
    
    public void addGive(String receiverName){
        this.give.add(receiverName);
    }
    public void addReceive(String giverName){
        this.receive.add(giverName);
    }
    public int calculateGiftFactor(){
        return this.give.size() - this.receive.size();
    }
}