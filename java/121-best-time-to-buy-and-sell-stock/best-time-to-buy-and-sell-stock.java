class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int profit =0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyprice<prices[i])
            {
                int maxprofit = prices[i]-buyprice;
                profit = Math.max(profit,maxprofit);
            }else{
            buyprice = prices[i];
            }
        }
        return profit;
    }
}