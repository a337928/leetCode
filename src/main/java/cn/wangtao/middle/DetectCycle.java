package cn.wangtao.middle;

import cn.wangtao.easy.HasCycle;

public class DetectCycle {

	public ListNode detectCycle(ListNode head) {
		if(head == null ){
			return null;
		}

		ListNode fast = head;
		ListNode slow = head;

		while (true){
			if (fast == null || fast.next == null){
				return null;
			}

			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast){
				break;
			}
		}

		fast = head;
		while (slow != fast){
			slow = slow.next;
			fast = fast.next;
		}

		return fast;
	}


	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
