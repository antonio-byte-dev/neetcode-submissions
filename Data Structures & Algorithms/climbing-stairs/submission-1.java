class Solution {
    public int climbStairsMemo(int n, Map<Integer,Integer> memo)
    {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        if(memo.get(n)!=null) return memo.get(n);
        else{
            int res = climbStairsMemo(n-1,memo) + climbStairsMemo(n-2,memo);
            memo.put(n,res);
            return res;
        }
        
    }
    public int climbStairs(int n) {
        Map<Integer,Integer> memo = new HashMap<>();


        return climbStairsMemo(n,memo);   
    }
}
