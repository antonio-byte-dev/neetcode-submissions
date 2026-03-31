class Solution {
    public int maxProfit(int[] prices) {
        
        int start = 0;
        int end = prices.length-1;
        int min = 9999;
        int max = 0;
        int profit = 0;
        while(start<=prices.length-1)
        {

            while(end>start){
                profit = Math.max(profit,prices[end]-prices[start]);
                end--;
            }
            end = prices.length-1; 
            start++;


        }
        return profit;
    }
}
