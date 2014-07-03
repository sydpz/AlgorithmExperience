package LinkedListCycle;

public class Solution {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean hasCycle(ListNode head) {
		if(head == null|| head.next == null){
			return false;
		}
		ListNode step1Node = head;
		ListNode step2Node = head.next;
		while(step1Node != step2Node){
			if(step1Node == null || step2Node == null){
				return false;
			}
			step1Node = step1Node.next;
			if(step1Node == null){
				return false;
			}
			step2Node = step2Node.next;
			if(step2Node == null){
				return false;
			}
			step2Node = step2Node.next;
		}
		return true;
	}
}
