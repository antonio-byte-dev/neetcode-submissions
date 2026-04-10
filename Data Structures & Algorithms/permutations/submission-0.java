class Solution {
    public void backtrack(int i,int[] nums,List<Integer> set, List<List<Integer>> res,Boolean[] chosen)
    {
        if(i==nums.length)
        {
            res.add(new ArrayList<>(set));
            return;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(chosen[j]==false)
            {
                set.add(nums[j]);
                chosen[j]=true;
                backtrack(i+1,nums,set,res,chosen);
                set.remove(set.size()-1);
                chosen[j] = false;
            }
            
            
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Boolean[] chosen = new Boolean[nums.length];
        Arrays.fill(chosen,Boolean.FALSE);
        backtrack(0,nums,new ArrayList<>(),res,chosen);
        return res; 
    }
}
