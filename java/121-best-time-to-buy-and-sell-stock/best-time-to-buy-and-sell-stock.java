class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit =Integer.MIN_VALUE;
        int buyprice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            int price = prices[i];
            if(price < buyprice)
            {
                buyprice = prices[i];
            }
            int profit = price - buyprice;
            maxprofit = Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}