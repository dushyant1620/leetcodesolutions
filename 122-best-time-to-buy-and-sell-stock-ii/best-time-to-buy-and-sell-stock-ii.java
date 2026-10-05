class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0 ;i<prices.length-1;i++){
            int buy  = prices[i];
            int sell = prices[i+1];
            if(sell>buy){
               maxProfit = maxProfit + (sell-buy);
            }
        }
        return maxProfit;
    }
}