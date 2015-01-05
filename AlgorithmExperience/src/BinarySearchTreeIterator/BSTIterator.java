package BinarySearchTreeIterator;

import java.util.LinkedList;

import DataStructure.TreeNode;

/**
 * Definition for binary tree public class TreeNode { int val; TreeNode left;
 * TreeNode right; TreeNode(int x) { val = x; } }
 */

public class BSTIterator {
	private LinkedList<Integer> queue = new LinkedList<Integer>();

	public BSTIterator(TreeNode root) {
		initQueue(root);
	}

	private void initQueue(TreeNode root) {
		if (root == null) {
			return;
		}
		initQueue(root.left);
		queue.add(root.val);
		initQueue(root.right);
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		if (queue.isEmpty()) {
			return false;
		}
		return true;
	}

	/** @return the next smallest number */
	public int next() {
		return queue.poll();
	}
}

/**
 * Your BSTIterator will be called like this: BSTIterator i = new
 * BSTIterator(root); while (i.hasNext()) v[f()] = i.next();
 */
