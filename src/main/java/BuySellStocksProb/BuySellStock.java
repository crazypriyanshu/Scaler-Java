package main.java.BuySellStocksProb;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i< prices.length; i++) {
            int potential_profit = prices[i] - minPrice;
            if(potential_profit > maxProfit) {
                maxProfit = potential_profit;
            }
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
