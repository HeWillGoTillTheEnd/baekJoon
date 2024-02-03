import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] mem1Answer = {1, 2, 3, 4, 5};
        int[] mem2Answer = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] mem3Answer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        Member mem1 = new Member(1,mem1Answer);
        Member mem2 = new Member(2,mem2Answer);
        Member mem3 = new Member(3,mem3Answer);
        
        ArrayList<Member> members = new ArrayList<>();
        members.add(mem1);
        members.add(mem2);
        members.add(mem3);
        for(Member m : members){
            m.scoring(answers);
        }
        ArrayList<Integer> result = new ArrayList<>();
        int max = 0;
        for(Member m : members){
            if(m.result > max) max = m.result;
        }
        for(Member m : members){
            if(max == m.result) result.add(m.index);
        }
        int[] answer = new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i] = result.get((Integer)i);
        }
        return answer;
    }
}
class Member {
    public int index;
    public int[] examAnswer;
    public int result;
    public Member(int index, int[] examAnswer){
        this.index = index;
        this.examAnswer = examAnswer;
        this.result = 0;
    }

    public void scoring(int[] answers){
        int counter = 0;
        for(int answer : answers){
            if(counter == this.examAnswer.length) counter = 0;
            if(answer == this.examAnswer[counter]) this.result++;
            counter++;
        }
    }
}