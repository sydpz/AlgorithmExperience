package BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Stack<List<Integer>> stack = new Stack<List<Integer>>();
		List<List<Integer>> retList = new ArrayList<List<Integer>>();
		if (root == null) {
			return retList;
		}
		Queue<TreeNode> inQueue = new LinkedList<TreeNode>();
		Queue<TreeNode> outQueue = new LinkedList<TreeNode>();
		outQueue.offer(root);
		while (!outQueue.isEmpty()) {
			Queue<TreeNode> tmpQueue = outQueue;
			outQueue = inQueue;
			inQueue = tmpQueue;
			List<Integer> lineList = new ArrayList<Integer>();
			while (!inQueue.isEmpty()) {
				TreeNode node = inQueue.poll();
				lineList.add(node.val);
				if (node.left != null) {
					outQueue.offer(node.left);
				}
				if (node.right != null) {
					outQueue.offer(node.right);
				}
			}
			stack.push(lineList);
		}
		while (!stack.isEmpty()) {
			retList.add(stack.pop());
		}
		return retList;
	}
}
