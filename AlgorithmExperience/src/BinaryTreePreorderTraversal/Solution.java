package BinaryTreePreorderTraversal;

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

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> retList = new ArrayList<Integer>();
		preOrder(root, retList);
		return retList;
	}

	private void preOrder(TreeNode root, List<Integer> retList) {
		if(root == null){
			return;
		}
		retList.add(root.val);
		preOrder(root.left, retList);
		preOrder(root.right, retList);
	}
}
