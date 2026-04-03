class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++)
        {
            int j = i+1;
            int k = nums.length-1;
            int target = -nums[i];
            while(j<k)
            {
                if(nums[j]+nums[k]<target)
                {
                    j++;
                }else if(nums[j]+nums[k]>target){
                    k--;
                }else{
                    List<Integer> sub_sol = new ArrayList<>();
                    sub_sol.add(nums[i]);
                    sub_sol.add(nums[j]);
                    sub_sol.add(nums[k]);
                    if(!result.contains(sub_sol))
                    {
                        result.add(sub_sol);
                    }
                    j++;
                }
            }
                
                
                
                
            
        }
        return result;
    }
}
