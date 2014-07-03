package BestTimeToBuyAndSellStockII;

public class Solution {
	public int maxProfit(int[] prices) {
		int profit = 0;
		int buyPrice = -1;
		int sellPrice = -1;
		for (int i = 0; i < prices.length; i++) {
			if (buyPrice == -1) {
				buyPrice = prices[i];
			} else {
				if (sellPrice == -1) {
					if (buyPrice < prices[i]) {
						sellPrice = prices[i];
					} else {
						buyPrice = prices[i];
					}
				} else {
					if (sellPrice > prices[i]) {
						profit += (sellPrice - buyPrice);
						buyPrice = prices[i];
						sellPrice = -1;
					} else {
						sellPrice = prices[i];
					}
				}
			}
		}
		if (sellPrice != -1) {
			profit += (sellPrice - buyPrice);
		}
		return profit;
	}

}
