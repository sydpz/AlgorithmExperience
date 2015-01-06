package BinaryTreeLevelOrderTraversal;

import java.util.LinkedList;
import java.util.List;

import DataStructure.TreeNode;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> retLists = new LinkedList<List<Integer>>();
		if (root == null) {
			return retLists;
		}
	
		LinkedList<TreeNode> inQueue = new LinkedList<TreeNode>();
		LinkedList<TreeNode> outQueue = new LinkedList<TreeNode>();
		inQueue.add(root);
		while (!inQueue.isEmpty()) {
			LinkedList<TreeNode> tmpQueue = inQueue;
			inQueue = outQueue;
			outQueue = tmpQueue;
			List<Integer> valueList = new LinkedList<Integer>();
			while (!outQueue.isEmpty()) {
				TreeNode node = outQueue.remove();
				valueList.add(node.val);
				if (node.left != null) {
					inQueue.add(node.left);
				}
				if (node.right != null) {
					inQueue.add(node.right);
				}
			}
			retLists.add(valueList);
		}
		return retLists;
	}
}
