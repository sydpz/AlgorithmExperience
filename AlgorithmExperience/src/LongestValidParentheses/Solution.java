package LongestValidParentheses;

import java.awt.Container;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.run();
	}

	void run() {
		String s = "()";
		System.out.println(longestValidParentheses(s));
	}

	public int longestValidParentheses(String s) {
		int tempSum = 0;
		if (s == null || s.length() == 0) {
			return 0;
		}
		int leftMaxSum = 0;
		int count = 0;
		int[] recordArray = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			char curChar = s.charAt(i);
			if (curChar == '(') {
				count++;
			} else if (curChar == ')') {
				if (count != 0) {
					count--;
					tempSum += 2;
					recordArray[count] = tempSum;
				} else {
					if (tempSum > leftMaxSum) {
						leftMaxSum = tempSum;
					}
					tempSum = 0;
				}
			}
		}
		tempSum -= recordArray[count];

		if (tempSum > leftMaxSum) {
			leftMaxSum = tempSum;
		}
		return leftMaxSum;
	}
}
