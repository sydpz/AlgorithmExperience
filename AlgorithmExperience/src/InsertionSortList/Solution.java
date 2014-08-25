package InsertionSortList;

import DataStructure.ListNode;

public class Solution {
	public ListNode insertionSortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode tmpHead = new ListNode(0);
		tmpHead.next = head;
		ListNode retList = getMinNode(tmpHead);
		ListNode tailNode = retList;
		while (tmpHead.next != null) {
			ListNode tmpNode = getMinNode(tmpHead);
			tailNode.next = tmpNode;
			tailNode = tmpNode;
		}

		return retList;
	}

	private ListNode getMinNode(ListNode head) {
		if (head.next == null) {
			return null;
		}
		int minValue = Integer.MAX_VALUE;
		ListNode minParentNode = head;
		ListNode tmpParentNode = head;

		while (tmpParentNode.next != null) {
			ListNode tmpNode = tmpParentNode.next;
			if (tmpNode.val < minValue) {
				minValue = tmpNode.val;
				minParentNode = tmpParentNode;
			}
			tmpParentNode = tmpParentNode.next;
		}

		ListNode minNode = minParentNode.next;
		minParentNode.next = minNode.next;
		minNode.next = null;
		return minNode;
	}
}
