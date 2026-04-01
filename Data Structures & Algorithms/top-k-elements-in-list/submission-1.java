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

        List<Integer>[] bucketSort = new List[nums.length+1];
        for(int i=0;i<bucketSort.length;i++)
        {
            bucketSort[i] = new ArrayList<>();
        }

        for(Integer n:freq.keySet())
        {
            //inserts n at index frequency
            bucketSort[freq.get(n)].add(n);
        }
        int index=0;

        for(int i= bucketSort.length-1;i>0 && index<k;i--)
        {
            for(int n : bucketSort[i]){
                result[index] =  n;
                index++;
                if(index==k) return result;
            }
        }
        return result;
    }
}
