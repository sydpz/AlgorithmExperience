package AddTwoNumbers;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.run();

	}

	private void run() {
		int[] numbers = { 3, 2, 4 };
		int target = 6;

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode tempL1 = l1;
		ListNode tempL2 = l2;
		ListNode retL = new ListNode(-1);
		ListNode retLTail = retL;
		boolean addOne = false;
		while ((tempL1 != null) && (tempL2 != null)) {
			int ret = tempL1.val + tempL2.val;
			if (addOne) {
				ret++;
			}
			if (ret >= 10) {
				ret -= 10;
				addOne = true;
			} else {
				addOne = false;
			}
			ListNode curNode = new ListNode(ret);
			retLTail.next = curNode;
			retLTail = curNode;
			tempL1 = tempL1.next;
			tempL2 = tempL2.next;
		}

		ListNode retNode = null;
		if (tempL1 != null) {
			retNode = tempL1;
		} else {
			retNode = tempL2;
		}
		
		while(retNode != null){
			int value = retNode.val;
			if(addOne){
				value ++;
			}
			if(value >= 10){
				value -=10;
				addOne = true;
			}else{
				addOne = false;
			}
			ListNode curNode = new ListNode(value);
			retLTail.next = curNode;
			retLTail = curNode;
			retNode = retNode.next;
		}
		
		if (addOne) {
			ListNode curNode = new ListNode(1);
			retLTail.next = curNode;
			retLTail = curNode;
		}
		return retL.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
