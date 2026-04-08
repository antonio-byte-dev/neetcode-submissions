class Solution {
    public int minCostClimbingMemo(int[] cost,Map<Integer,Integer> memo,int i)
    {
        if(i>=cost.length) return 0;
        if(memo.get(i)!=null) return memo.get(i);
        int var1 = minCostClimbingMemo(cost,memo,i+1) + cost[i];
        int var2 = minCostClimbingMemo(cost,memo,i+2) + cost[i];
        int res = Math.min(var1,var2);
        memo.put(i,res);
        return res;
    }
    public int minCostClimbingStairs(int[] cost) {
        Map<Integer,Integer> memo = new HashMap<>();

        return Math.min(minCostClimbingMemo(cost,memo,0),minCostClimbingMemo(cost,memo,1));
    }
}
