package SingleNumber;

public class Solution {
	public int singleNumber(int[] A) {
		int ret = 0;
		for (int i = 0; i < A.length; i++) {
			ret ^= A[i];
		}
		return ret;
	}
}
