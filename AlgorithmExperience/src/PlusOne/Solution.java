package PlusOne;

public class Solution {
	public int[] plusOne(int[] digits) {
		if (digits == null) {
			return null;
		}
		int[] ret = null;
		boolean isNeedCarry = true;
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] != 9) {
				isNeedCarry = false;
				break;
			}
		}
		if (isNeedCarry) {
			ret = new int[digits.length + 1];
			ret[0] = 1;
			return ret;
		}
		isNeedCarry = true;
		ret = new int[digits.length];
		for (int i = 0; i < digits.length; i++) {
			ret[i] = digits[i];
		}

		for (int i = ret.length - 1; i >= 0; i--) {
			if (isNeedCarry) {
				ret[i]++;
				if (ret[i] == 10) {
					ret[i] = 0;
					isNeedCarry = true;
				} else {
					isNeedCarry = false;
					break;
				}
			}
		}
		return ret;
	}
}
