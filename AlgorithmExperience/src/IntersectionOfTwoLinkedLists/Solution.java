package IntersectionOfTwoLinkedLists;

import DataStructure.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode retNode = null;
		if (headA == null || headB == null) {
			return null;
		}
		int aLength = 0;
		int bLength = 0;
		ListNode tmpANode = headA;
		while (tmpANode != null) {
			tmpANode = headA.next;
			aLength++;
		}
		ListNode tmpBNode = headB;
		while (tmpBNode != null) {
			tmpBNode = headB.next;
			bLength++;
		}
		if (bLength > aLength) {
			int diff = bLength - aLength;
			for (int i = 0; i < diff; i++) {
				headB = headB.next;
			}
		} else {
			int diff = aLength - bLength;
			for (int i = 0; i < diff; i++) {
				headA = headA.next;
			}
		}

		while (headA != null && headB != null) {
			if (headA == headB) {
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		}

		return null;
	}
}