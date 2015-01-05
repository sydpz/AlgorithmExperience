package Candy;

public class Solution {
	public int candy(int[] ratings) {
		int sum = 0;
		int length = ratings.length;
		if (ratings == null || length == 0) {
			return 0;
		}
		if (length == 1) {
			return 1;
		}
		int[] candyArray = new int[length];
		for (int i = 0; i < length; i++) {
			if (i == 0 && ratings[0] <= ratings[1]) {
				candyArray[0] = 1;
			} else if (i == length - 1
					&& ratings[length - 1] <= ratings[length - 2]) {
				candyArray[length - 1] = 1;
			} else if (ratings[i] <= ratings[i - 1]
					&& ratings[i] >= ratings[i + 1]) {
				candyArray[i] = 1;
			} else {
				candyArray[i] = -1;
			}
		}
		for (int i = 1; i < length; i++) {
			if (ratings[i] > ratings[i - 1]) {
				candyArray[i] = candyArray[i - 1] + 1;
			} else if (ratings[i] == ratings[i - 1]) {
				candyArray[i] = candyArray[i - 1];
			}
		}
		for (int i = length - 1; i >= 0; i--) {
			if (i == 0 && ratings[0] > ratings[1]) {
				candyArray[0] = candyArray[1] + 1;
			} else if (ratings[i] > ratings[i + 1]) {

				candyArray[i] = Math.max(candyArray[i], candyArray[i + 1] + 1);

			} else if (ratings[i] == ratings[i + 1]) {
				candyArray[i] = candyArray[i - 1];
			}
		}

		return sum;
	}
}
