class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=1;
        int[] sol = new int[2];
        while(i<j&&i<numbers.length)
        {
            while(j<numbers.length)
            {
                int res = numbers[i]+numbers[j];
                if(res==target){
                    sol[0]=i+1;
                    sol[1]=j+1;
                    return sol;
                }else{
                    j++;
                }
            }
            i++;
            j=i+1;

            
        }
        return sol;
    }
}
