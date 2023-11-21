import java.util.*;

class Solution {
    

    static ArrayList<Integer> memoization = new ArrayList<>();
    static ArrayList<Integer> bucket = new ArrayList<>();
    static int answer = 0;
    
    public int solution(int[] nums) {
        ArrayList<Integer> numsArray = new ArrayList<>();
        for (int num : nums) numsArray.add(num);
        number(numsArray,0);
        return answer;
    }

    void number(ArrayList<Integer> nums, int depth){
        int result = 0;
        if(bucket.size() == 3) {
            for(Integer a : bucket){
                result += a;
            }
            if(memoization.contains(result)){
                answer++;
                return;
            }
            else {
                if(check(result)) {
                    answer++;
                    memoization.add(result);
                    return;
                } else return;
            }
        }

        for(int i=depth; i<nums.size();i++){
            bucket.add(nums.get(i));
            depth++;
            number(nums,depth);
            bucket.remove(nums.get(i));
        }
    }
    boolean check(int result) {
        for(int i =2; i<result;i++){
            if(result % i ==0) return false;
        }
        return true;
    }
}