package UniqueBinarySearchTrees;

public class Solution {
	public int numTrees(int n) {
		int ret = 0;
		if (n <= 0) {
			return 0;
		}
		int[] sumArray = new int[n + 1];
		sumArray[0] = 1;
		sumArray[1] = 1;
		for (int i = 2; i <= n; i++) {
			int sum = 0;
			for (int j = 0; j < i; j++) {
				sum += sumArray[i - 1 - j] * sumArray[j];
			}
			sumArray[i] = sum;
		}
		ret = sumArray[n];
		return ret;
	}
}
