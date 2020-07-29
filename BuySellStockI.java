class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        
        int profit = 0;
        int curr = prices[0];
        for (int i = 0; i < prices.length; i++) {
            
            if (prices[i] <curr) {
                curr = prices[i] ;
            }
            
            if (prices[i] > curr) {
                profit = Math.max(prices[i]-curr, profit);
            }
        }
        
        
        return profit;
        
        
        
        
        
        
    }
}
