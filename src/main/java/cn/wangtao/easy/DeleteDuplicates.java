package cn.wangtao.easy;

import java.util.Objects;

public class DeleteDuplicates {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		while (current!= null && current.next != null){
			if (Objects.equals(current.val, current.next.val)){
				current.next = current.next.next;
			} else {
				current = current.next;
			}

		}

		return head;

	}


	/**
	 * Definition for singly-linked list.
	 * */
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}



