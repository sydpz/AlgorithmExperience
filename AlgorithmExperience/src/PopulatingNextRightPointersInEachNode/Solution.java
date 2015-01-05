package PopulatingNextRightPointersInEachNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

import DataStructure.TreeLinkNode;

public class Solution {
	public  void connect(TreeLinkNode root) {
		if (root == null) {
			return;
		}
		ArrayList<TreeLinkNode> inputQueue = new ArrayList<TreeLinkNode>();
		ArrayList<TreeLinkNode> outputQueue = new ArrayList<TreeLinkNode>();
		inputQueue.add(root);
		while (!inputQueue.isEmpty()) {
			for (int i = 0; i < inputQueue.size(); i++) {
				TreeLinkNode tmpNode = inputQueue.get(i);
				if (i == inputQueue.size() - 1) {
					tmpNode.next = null;
				} else {
					tmpNode.next = inputQueue.get(i + 1);
				}
				if (tmpNode.left != null) {
					outputQueue.add(tmpNode.left);
				}
				if (tmpNode.right != null) {
					outputQueue.add(tmpNode.right);
				}
			}
			inputQueue.clear();
			ArrayList<TreeLinkNode> tmpQueue = outputQueue;
			outputQueue = inputQueue;
			inputQueue = tmpQueue;
		}
	}
}
