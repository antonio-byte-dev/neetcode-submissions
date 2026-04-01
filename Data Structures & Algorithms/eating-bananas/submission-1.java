class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        Arrays.sort(piles);
        int max = piles[piles.length-1];
        int res = max;
        while(min<=max)
        {
            int mid = (max+min)/2;
            long k = 0;
            for(int i=0;i<piles.length;i++)
            {   
                k+=Math.ceil((double)piles[i]/mid);
            }
            
            //If you exceed h you look for a higher eating rate
            if(k>h)
            {
               
               min = mid+1;
            }else{
                //if i dont reach h i look for a lower one
                res = Math.min(res,mid);
                max = mid-1;
            }

        }
        return res;
    }
}
