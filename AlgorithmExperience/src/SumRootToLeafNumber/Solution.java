package SumRootToLeafNumber;

public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int sumNumbers(TreeNode root) {
		int sum = 0;
		if (root == null) {
			return 0;
		}
		sum = getSumValue(root, 0);
		return sum;
	}

	private int getSumValue(TreeNode root, int number) {
		if (root == null) {
			return 0;
		}
		int curNumber = number * 10 + root.val;
		if (root.left == null && root.right == null) {
			return curNumber;
		}
		int leftNodeNumber = getSumValue(root.left, curNumber);
		int rightNodeNumber = getSumValue(root.right, curNumber);

		return (leftNodeNumber + rightNodeNumber);
	}
}
