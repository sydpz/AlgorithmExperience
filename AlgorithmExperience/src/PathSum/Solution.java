package PathSum;

public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		int remain = sum - root.val;
		if (remain == 0 && root.left == null && root.right == null) {
			return true;
		}
		return hasPathSum(root.left, remain) || hasPathSum(root.right, remain);
	}
}
