package CloneGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	class UndirectedGraphNode {
		int label;
		List<UndirectedGraphNode> neighbors;

		UndirectedGraphNode(int x) {
			label = x;
			neighbors = new ArrayList<UndirectedGraphNode>();
		}
	}

	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		UndirectedGraphNode ret = null;
		if (node == null) {
			return ret;
		}
		List<UndirectedGraphNode> searchedNodeList = new ArrayList<UndirectedGraphNode>();
		ret = copyGraph(node, searchedNodeList);

		return ret;
	}

	private UndirectedGraphNode copyGraph(UndirectedGraphNode node,
			List<UndirectedGraphNode> searchedNodeList) {
		UndirectedGraphNode ret = null;
		ret = new UndirectedGraphNode(node.label);
		searchedNodeList.add(ret);
		for (int i = 0; i < node.neighbors.size(); i++) {
			UndirectedGraphNode curNode = node.neighbors.get(i);
			if (hasSearched(searchedNodeList, curNode.label)) {
				ret.neighbors.add(searchedNodeList.get(searchedNodeList
						.indexOf(curNode)));
			} else {
				UndirectedGraphNode copyNode = copyGraph(curNode,
						searchedNodeList);

			}

		}
		return ret;
	}
}