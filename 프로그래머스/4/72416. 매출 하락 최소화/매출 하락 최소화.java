import java.util.*;

class Solution {
    public int[] Sales;
    public List<List<Integer>> children = new ArrayList<>();
    public int[][] dp;
    public int solution(int[] sales, int[][] links) {
        dp = new int[sales.length][2];
        Sales = sales;
        for(int i =0; i<sales.length;i++){
            children.add(new ArrayList<Integer>());
        }
        for(int i =0; i<links.length;i++){
            children.get(links[i][0]-1).add(links[i][1]-1);
        }
        
        recursive(0);
        return Math.min(dp[0][0],dp[0][1]);
    }
    
    public void recursive(int node){
        dp[node][0] = 0;
        dp[node][1] = Sales[node];
        
        if(children.get(node).isEmpty()) return;
        int extraCost = 10001;
        for(Integer child : children.get(node)){
            recursive(child);
            if(dp[child][0] < dp[child][1]){
                dp[node][0] += dp[child][0];
                dp[node][1] += dp[child][0];
                extraCost = Math.min(extraCost, dp[child][1] - dp[child][0]);
            } else{
                dp[node][0] += dp[child][1];
                dp[node][1] += dp[child][1];
                extraCost = 0;
            }    
        }
        dp[node][0] += extraCost;
    }
}