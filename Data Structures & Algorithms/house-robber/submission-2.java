class Solution {
    public int rob_memo(int[] nums,int i,Map<Integer,Integer> map)
    {
        if(i>=nums.length) return 0;
        if(map.get(i)!=null) return map.get(i); 
        int res = Math.max(rob_memo(nums,i+1,map),rob_memo(nums,i+2,map) + nums[i]);
        map.put(i,res);
        return res;

    }
    public int rob(int[] nums) {
        Map<Integer,Integer> money = new HashMap<>();
        return rob_memo(nums,0,money);
    }   
}
