class Solution {
    public int maxProfit(int[] prices) {
        
        int p1 = 0;
        int p2 = 1;
        
        int profit = 0;
        while(p2<prices.length && p1<prices.length)
        {
            profit= Math.max(prices[p2]-prices[p1],profit);
            if(prices[p2]<prices[p1])
            {
                p1=p2;
                p2++;
            }else{
                p2++;
            }

            
        }
        return profit;
    }
}
