package MaximumDepthOfBinaryTree;

public class Solution {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int maxDepth(TreeNode root) {
		int ret = 0;
		ret = computeMaxDepth(root);
		return ret;
	}

	private int computeMaxDepth(TreeNode root) {
		if(root == null){
			return 0;
		}
		int ret = 1;
		if (root.left == null && root.right == null) {
			return ret;
		}
		int leftDepth = computeMaxDepth(root.left);
		int rightDepth = computeMaxDepth(root.right);
		ret += leftDepth > rightDepth ? leftDepth : rightDepth;
		return ret;
	}
}
