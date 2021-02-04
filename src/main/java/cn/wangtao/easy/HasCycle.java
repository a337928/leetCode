package cn.wangtao.easy;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {

	private Set<ListNode> hasNode = new HashSet();


	public boolean hasCycle(ListNode head) {
		if(head == null ){
			return Boolean.FALSE;
		}


		if (hasNode.contains(head.next)) {
			return Boolean.TRUE;
		}

		hasNode.add(head);

		return hasCycle(head.next);
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
