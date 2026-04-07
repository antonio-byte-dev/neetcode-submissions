class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        
        int min = nums[0];
        while(start<=end)
        {
            if(nums[start]<nums[end]) return Math.min(min,nums[start]);

            int mid = (start+end)/2;
            min = Math.min(min,nums[mid]);

            if(nums[mid]>=nums[start])
            {
                start = mid+1;
            }else{
                end = mid-1;
            }

            
        }
        return min;

    }
}
