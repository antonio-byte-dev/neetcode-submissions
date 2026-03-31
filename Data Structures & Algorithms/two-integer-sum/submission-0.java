class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> complement = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int obj = target-nums[i];

            if(complement.get(obj)!=null)
            {
                result[0] = complement.get(obj);
                result[1]=i;
                return result;
            }
            complement.put(nums[i],i);
        }

        return result;
    }
}
