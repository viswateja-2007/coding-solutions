class Solution {
    public int maxProfit(int[] prices) {
        int profitMax = 0;
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++){
            int sell = prices[i];
            buy = Math.min(buy, sell);
            if(buy < sell){
                profit = sell - buy;
            }
            
            profitMax = Math.max(profit, profitMax);
        }
        
        
        return profitMax;
        
    }
}