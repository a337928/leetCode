package cn.wangtao.easy;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {



	public boolean hasCycle(ListNode head) {
		if(head == null ){
			return Boolean.FALSE;
		}

		ListNode fast = head;
		ListNode slow = head;

		while (fast != null){
			fast = fast.next;
			if (fast == null){
				return Boolean.FALSE;
			}
			fast = fast.next;
			slow = slow.next;
			if (slow == fast){
				return Boolean.TRUE;
			}
		}

		return Boolean.FALSE;
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
