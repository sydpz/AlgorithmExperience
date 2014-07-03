package Sqrt;

public class Solution {
	public static void main(String args[]) {
		Solution test = new Solution();
		test.run();
	}

	private void run() {
		int ret = sqrt(2147395599);
		System.out.println(ret);
	}

	public int sqrt(int x) {
		if (x < 0) {
			return -1;
		}
		if (x == 0) {
			return 0;
		}
		int ret = 1;
		int i = 1;
		for (i = 1; i <= x; i *= 2) {
			int tempResult = i * i;
			if (tempResult == x) {
				return i;
			}
			if (tempResult > x || tempResult <= 0) {
				break;
			}
		}
		int start = i / 2;
		int end = i;
		while (start <= end) {
			ret = (end - start) / 2 + start;
			int tempResult = ret * ret;
			if (tempResult == x) {
				return ret;
			}
			if (tempResult <= 0 || tempResult > x) {
				end = ret - 1;
				ret = end;
			} else {
				start = ret + 1;
			}
		}
		return ret;
	}
}
