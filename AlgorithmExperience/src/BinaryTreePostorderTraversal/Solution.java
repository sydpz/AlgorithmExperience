package BinaryTreePostorderTraversal;

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

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> retList = new ArrayList<Integer>();
		postOrder(root, retList);
		return retList;
	}

	private void postOrder(TreeNode root, List<Integer> retList) {
		if(root == null){
			return;
		}
		postOrder(root.left, retList);
		postOrder(root.right, retList);
		retList.add(root.val);
	}

}
