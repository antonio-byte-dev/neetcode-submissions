class Solution {
    public int rob_memo(int[] nums,int i,int[][] memo,int picked)
    {
       
        if(i==nums.length-1&&picked==1) 
        {
            return 0;
        }
        if(i>=nums.length) return 0;
        if(memo[i][picked]!=0){
            return memo[i][picked]; 
        }
        int val = 0;
        if(i==0){
            val = Math.max(rob_memo(nums,i+1,memo,0),rob_memo(nums,i+2,memo,1)+nums[i]);
        }else{
            val = Math.max(rob_memo(nums,i+1,memo,picked),rob_memo(nums,i+2,memo,picked)+nums[i]);
        }
        memo[i][picked] = val;

        return val;
    }
    public int rob(int[] nums) {
        int[][] memo = new int[nums.length][2]; 
        return rob_memo(nums,0,memo,0);
    }
}
