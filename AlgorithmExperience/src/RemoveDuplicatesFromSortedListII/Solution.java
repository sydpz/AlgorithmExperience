package RemoveDuplicatesFromSortedListII;

import DataStructure.ListNode;

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode retHead = head;
		ListNode tmpParent = head;
		ListNode tmpChild = head.next;
		return null;
	}
}
