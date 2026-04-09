class Solution {
    public void comb_backtrack(int i,int[] nums,int target, List<Integer> set, List<List<Integer>> res)
    {
        if(target==0)
        {
            List<Integer> cpy = new ArrayList<>(set);
            if(!res.contains(cpy))
            {
                res.add(cpy);
            }
            
            return;
        }else if(target<0) return;
        if(i>=nums.length) return;
        set.add(nums[i]);
        comb_backtrack(i,nums,target-nums[i],set,res);
        comb_backtrack(i+1,nums,target-nums[i],set,res);
        set.remove(set.indexOf(nums[i]));
        comb_backtrack(i+1,nums,target,set,res);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int sum = 0;
        List<List<Integer>> res = new ArrayList<>();
        comb_backtrack(0,nums,target,new ArrayList<>(),res);
        return res;
    }
}
