package FlattenBinaryTreeToLinkedList;

import DataStructure.TreeNode;

public class Solution {
	public void flatten(TreeNode root) {
		if (root == null) {
			return;
		}
		flatten(root.left);
		flatten(root.right);
		mergeTree(root);
	}

	void mergeTree(TreeNode root) {
		if (root == null || root.left == null) {
			return;
		}
		TreeNode tmpRightNode = root.right;
		root.right = root.left;
		root.left = null;
		TreeNode tmpNode = root.right;
		while (tmpNode.right != null) {
			tmpNode = tmpNode.right;
		}
		tmpNode.right = tmpRightNode;
	}
}
