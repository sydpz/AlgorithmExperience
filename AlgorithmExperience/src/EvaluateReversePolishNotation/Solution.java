package EvaluateReversePolishNotation;

import java.util.Stack;

public class Solution {
	public int evalRPN(String[] tokens) {
		int ret = 0;
		if (tokens == null || tokens.length == 0) {
			return ret;
		}
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equals("+")) {
				int item1 = stack.pop();
				int item2 = stack.pop();
				int sum = item1 + item2;
				stack.push(sum);
			} else if (tokens[i].equals("-")) {
				int item1 = stack.pop();
				int item2 = stack.pop();
				int sum = item2 - item1;
				stack.push(sum);
			} else if (tokens[i].equals("*")) {
				int item1 = stack.pop();
				int item2 = stack.pop();
				int sum = item2 * item1;
				stack.push(sum);
			} else if (tokens[i].equals("/")) {
				int item1 = stack.pop();
				int item2 = stack.pop();
				int sum = item2 / item1;
				stack.push(sum);
			} else {
				int item = Integer.parseInt(tokens[i]);
				stack.push(item);
			}
		}
		ret = stack.pop();
		return ret;
	}
}
