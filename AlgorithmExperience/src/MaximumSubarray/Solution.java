package MaximumSubarray;

public class Solution {
	public int maxSubArray(int[] A) {
		int ret = 0;
		int maxValue = Integer.MIN_VALUE;
		if (A == null || A.length == 0) {
			return 0;
		}

		for (int i = 0; i < A.length; i++) {
			if (ret < 0) {
				ret = A[i];
			} else {
				ret += A[i];
			}
			if (ret > Integer.MIN_VALUE) {
				maxValue = ret;
			}
		}
		return maxValue;
	}
}
