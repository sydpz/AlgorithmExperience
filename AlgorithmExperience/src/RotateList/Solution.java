package RotateList;

public class Solution {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		Solution rotateList = new Solution();
		rotateList.run();

	}

	private void run() {
		ListNode head = new ListNode(1);
		ListNode tail = new ListNode(2);
		head.next = tail;
		rotateRight(head, 1);
	}

	public ListNode rotateRight(ListNode head, int n) {
		if (head == null || head.next == null || n <= 0) {
			return head;
		}
		ListNode origHead = head;
		ListNode tmpNode = head;
		for (int i = 0; i < n; i++) {
			tmpNode = tmpNode.next;
			if (tmpNode == null) {
				tmpNode = head;
			}
		}

		while (tmpNode.next != null) {
			tmpNode = tmpNode.next;
			head = head.next;
		}

		tmpNode.next = origHead;
		ListNode retHead = head.next;
		head.next = null;
		return retHead;
	}
}
