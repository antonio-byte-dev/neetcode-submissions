class Solution {
    public void comb_backtrack(int i,int[] nums,int target, List<Integer> set, List<List<Integer>> res)
    {
        if(target==0)
        {
            List<Integer> cpy = new ArrayList<>(set);
            res.add(cpy);
            return;
        }
        
        for(int j=i;j<nums.length;j++)
        {
            //If we exceed target we return since the array is ordered
            if(target-nums[j]<0)return;
            set.add(nums[j]);
            comb_backtrack(j,nums,target-nums[j],set,res);
            set.remove(set.size()-1);
        }

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int sum = 0;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        comb_backtrack(0,nums,target,new ArrayList<>(),res);
        return res;
    }
}
