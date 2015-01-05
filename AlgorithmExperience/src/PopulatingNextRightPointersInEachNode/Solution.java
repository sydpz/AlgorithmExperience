package PopulatingNextRightPointersInEachNode;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

import DataStructure.TreeLinkNode;

public class Solution {
	public void connect(TreeLinkNode root) {
		if (root == null) {
			return;
		}
		LinkedList<TreeLinkNode> inputQueue = new LinkedList<TreeLinkNode>();
		LinkedList<TreeLinkNode> outputQueue = new LinkedList<TreeLinkNode>();
		inputQueue.add(root);
		while (!inputQueue.isEmpty() && !outputQueue.isEmpty()) {
			if (inputQueue.isEmpty()) {
				LinkedList<TreeLinkNode> tmpQueue = inputQueue;
				inputQueue = outputQueue;
				outputQueue = tmpQueue;
			}
			TreeLinkNode tmpNode = inputQueue.remove();
			if (tmpNode.left != null) {
				outputQueue.add(tmpNode.left);
			}
			if (tmpNode.right != null) {
				outputQueue.add(tmpNode.right);
			}
			while (!inputQueue.isEmpty()) {
				TreeLinkNode tmpNode2 = inputQueue.remove();
				if (tmpNode2.left != null) {
					outputQueue.add(tmpNode2.left);
				}
				if (tmpNode2.right != null) {
					outputQueue.add(tmpNode2.right);
				}
				tmpNode.next = tmpNode2;
				tmpNode = tmpNode2;
			}
			tmpNode.next = null;
		}
	}
}
