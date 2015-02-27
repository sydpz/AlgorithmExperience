package DecodeWays;

public class Solution {
	public int numDecodings(String s) {
		int retSum = 0;
		if (s == null || s.length() == 0) {
			return 0;
		}
		if (s.length() == 1) {
			String value = s.substring(0, 1);
			int intValue = Integer.parseInt(value);
			if (intValue > 0 && intValue <= 26) {
				return 1;
			} else {
				return 0;
			}
		}
		int[] retArray = new int[s.length()];
		String value = s.substring(0, 1);
		int intValue = Integer.parseInt(value);
		if (intValue > 0 && intValue <= 26) {
			retArray[0] = 1;
		} else {
			retArray[0] = 0;
		}
		value = s.substring(0, 2);
		intValue = Integer.parseInt(value);
		if (intValue > 0 && intValue <= 26) {
			retArray[1] = 1 + retArray[0];
		}
		for (int i = 2; i < s.length(); i++) {
			value = s.substring(i - 1, i + 1);
			intValue = Integer.parseInt(value);
			retArray[i] = retArray[i - 1];
			if (intValue > 0 && intValue <= 26) {
				retArray[i] += retArray[i - 2];
			}
		}
		return retArray[retArray.length - 1];
	}
}
