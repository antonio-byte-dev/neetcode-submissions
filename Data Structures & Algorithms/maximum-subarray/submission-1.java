class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {

            sum+=nums[i];
            if(sum>=0)
            {
                maxSum=Math.max(maxSum,sum);
                res.add(nums[i]);
            }else{
                res.clear();
                maxSum=Math.max(maxSum,nums[i]);
                sum=0;
            }
        }
        
        return maxSum;
    }
}
