package SwapNodesInPairs;

import DataStructure.ListNode;

public class Solution {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode retListNode = null;
		ListNode retListTail = null;
		ListNode searchNode = head;
		while (searchNode != null) {
			ListNode swappedNode = searchNode.next;
			if (swappedNode == null) {
				break;
			}
			searchNode.next = swappedNode.next;
			searchNode = searchNode.next;
			if (retListNode == null) {
				retListNode = swappedNode;
				retListTail = swappedNode;
			} else {
				retListTail.next = swappedNode;
				retListTail = swappedNode;
			}
		}
		retListTail.next = null;

		ListNode rebuildListNode = null;
		ListNode rebuildTail = null;
		retListNode = retListNode.next;

		while (retListNode != null && head != null) {
			ListNode aNode = retListNode;
			ListNode bNode = head;
			retListNode = retListNode.next;
			head = head.next;
			if (rebuildListNode == null) {
				rebuildListNode = aNode;
				aNode.next = bNode;
				rebuildTail = bNode;
			} else {
				rebuildTail.next = aNode;
				aNode.next = bNode;
				rebuildTail = bNode;
			}
		}
		if (head != null) {
			rebuildTail.next = head;
		}
		return rebuildListNode;
	}
}
