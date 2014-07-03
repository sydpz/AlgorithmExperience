package BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> retList = new ArrayList<Integer>();
		computeInorderTraversal(root, retList);
		return retList;
	}

	private void computeInorderTraversal(TreeNode root, List<Integer> retList) {
		if (root == null) {
			return;
		}
		computeInorderTraversal(root.left, retList);
		retList.add(root.val);
		computeInorderTraversal(root.right, retList);
	}

}
