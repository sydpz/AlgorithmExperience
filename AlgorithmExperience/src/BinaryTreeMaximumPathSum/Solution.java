package BinaryTreeMaximumPathSum;

import DataStructure.TreeNode;

public class Solution {
	public int maxPathSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return root.val;
		}

		PathRecord rootPathRecord = new PathRecord(0, 0);
		getMaxPath(root, rootPathRecord);

		return rootPathRecord.maxSum;
	}

	private void getMaxPath(TreeNode root, PathRecord rootRecord) {
		if (root == null) {
			rootRecord.maxPath = 0;
			rootRecord.maxSum = 0;
			return;
		}
		if (root.left == null && root.right == null) {
			rootRecord.maxPath = root.val;
			rootRecord.maxSum = root.val;
			return;
		}
		int leftMaxPath = Integer.MIN_VALUE;
		int leftMaxSum = Integer.MIN_VALUE;
		if (root.left != null) {
			getMaxPath(root.left, rootRecord);
			leftMaxPath = rootRecord.maxPath;
			leftMaxSum = rootRecord.maxSum;
		}
		int rightMaxPath = Integer.MIN_VALUE;
		int rightMaxSum = Integer.MIN_VALUE;
		if (root.right != null) {
			getMaxPath(root.right, rootRecord);
			rightMaxPath = rootRecord.maxPath;
			rightMaxSum = rootRecord.maxSum;
		}
		rootRecord.maxPath = leftMaxPath > rightMaxPath ? (leftMaxPath + root.val)
				: (rightMaxPath + root.val);
		int maxSum = leftMaxSum > rightMaxSum ? leftMaxSum : rightMaxSum;
		int curSum = root.val;
		if (leftMaxPath > 0) {
			curSum += leftMaxPath;
		}
		if (rightMaxPath > 0) {
			curSum += rightMaxPath;
		}
		rootRecord.maxSum = maxSum > curSum ? maxSum : curSum;
	}

	class PathRecord {
		int maxSum;
		int maxPath;

		PathRecord(int maxSum, int maxPath) {
			this.maxSum = maxSum;
			this.maxPath = maxPath;
		}
	}
}