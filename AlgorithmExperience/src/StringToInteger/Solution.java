package StringToInteger;

public class Solution {
	public int atoi(String str) {
		int ret = 0;
		if (str == null || str.length() == 0) {
			return 0;
		}
		boolean flag = true;
		str = str.trim();
		char firstFlag = str.charAt(0);
		if (firstFlag == '-') {
			flag = false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				continue;
			}
			if (i == 0) {
				if (!flag) {
					continue;
				}
				if (str.charAt(i) == '+') {
					continue;
				}
			}
			if (i == 1 && str.charAt(i) == '0') {
				return 0;
			}

			int number = str.charAt(i) - '0';
			if (number < 0 || number > 9) {
				if (!flag) {
					ret = 0 - ret;
				}
				return ret;
			}
			ret *= 10;
			ret += number;
		}
		if (ret < 0) {
			return Integer.MAX_VALUE;
		}
		if (!flag) {
			ret = 0 - ret;
		}
		return ret;
	}
}
