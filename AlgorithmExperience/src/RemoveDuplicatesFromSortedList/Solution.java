package RemoveDuplicatesFromSortedList;

import DataStructure.ListNode;

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode tmpNode = head;
		while (tmpNode != null) {
			int curVal = tmpNode.val;
			ListNode nextNode = tmpNode.next;
			if (nextNode == null) {
				return head;
			}
			int nextVal = nextNode.val;
			if (nextVal == curVal) {
				tmpNode.next = nextNode.next;
			} else {
				tmpNode = tmpNode.next;
			}
		}
		return head;
	}
}
