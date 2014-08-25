package BestTimeToBuyAndSellStock;

public class Solution {
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int lowPrice = prices[0];
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < lowPrice) {
				lowPrice = prices[i];
			} else {
				int tempProfit = prices[i] - lowPrice;
				if (tempProfit > maxProfit) {
					maxProfit = tempProfit;
				}
			}
		}
		return maxProfit;
	}
}
