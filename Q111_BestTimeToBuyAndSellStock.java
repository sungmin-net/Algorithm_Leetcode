// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = 0;
        int maxProfit = 0;
        for (int i = 1 ; i < prices.length ; i++) {
            if (prices[i] < prices[buyDay]) {
                buyDay = i;
            }
            if (prices[i] > prices[buyDay]) {
                maxProfit = Math.max(maxProfit, prices[i] - prices[buyDay]);
            }
        }

        return maxProfit;
    }
}