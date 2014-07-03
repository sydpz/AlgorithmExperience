package BalancedBinaryTree;

public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (!isBalanced(root.left) || !isBalanced(root.right)) {
			return false;
		}
		int leftDepth = computeTreeDepth(root.left);
		int rightDepth = computeTreeDepth(root.right);
		int depthDiff = Math.abs(leftDepth - rightDepth);
		if (depthDiff > 1) {
			return false;
		}
		return true;
	}

	private int computeTreeDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int depth = 1;
		int leftDepth = computeTreeDepth(root.left);
		int rightDepth = computeTreeDepth(root.right);
		if (leftDepth > rightDepth) {
			depth += leftDepth;
		} else {
			depth += rightDepth;
		}
		return depth;
	}
}
