package MergeTwoLists;

public class Solution {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode retNode = null;
		ListNode retTail = null;
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		ListNode l1Tail = l1;
		ListNode l2Tail = l2;
		while (l1Tail != null && l2Tail != null) {
			ListNode curNode = null;
			if (l1Tail.val < l2Tail.val) {
				curNode = l1Tail;
				l1Tail = l1Tail.next;
			} else {
				curNode = l2Tail;
				l2Tail = l2Tail.next;
			}
			if (curNode != null) {
				if (retNode == null) {
					retNode = curNode;
					retTail = curNode;
				} else {
					retTail.next = curNode;
					retTail = retTail.next;
				}
			}
		}
		if (l1Tail != null) {
			retTail.next = l1Tail;
		}
		if (l2Tail != null) {
			retTail.next = l2Tail;
		}
		return retNode;
	}
}
