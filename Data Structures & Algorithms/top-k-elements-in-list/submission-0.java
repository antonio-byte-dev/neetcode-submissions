class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(freq.get(nums[i])!=null)
            {
                freq.put(nums[i],freq.get(nums[i])+1);
            }else{
                freq.put(nums[i],1);
            }
        }

        int[] result = new int[k];
        for(int i=0;i<k;i++)
        {
            result[i] = -9999;
        }
        for(int i=0;i<k;i++)
        {
            for(Integer n : freq.keySet())
            {
                if(result[i] == -9999)
                {
                    result[i]=n;
                } 
                else if(freq.get(n)>freq.get(result[i]))
                {
                    result[i] = n;
                }
            }
            freq.remove(result[i]);
        }

        return result;
    
    }
}
