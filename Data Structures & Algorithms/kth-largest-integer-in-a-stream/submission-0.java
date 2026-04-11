class KthLargest {

    private int k;
    private int[] nums;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        Arrays.sort(this.nums);
    }
    public void insertOrdered(int[] cpy,int index,int target)
    {
        for(int i=0;i<cpy.length;i++)
        {
            if(i<index)
            {
                cpy[i] = nums[i];
            }else if(i==index)cpy[i] = target;
            else{
                cpy[i] = nums[i-1];
            }
        }
        
    }
    public int add(int val) {
        
        int[] cpy = new int[nums.length+1];
        int index = 0;
        while(index<nums.length && nums[index]<=val )
        {
            index++;
        }
        insertOrdered(cpy,index,val);
        nums = cpy;
        return nums[nums.length-k];
        
    }
}
