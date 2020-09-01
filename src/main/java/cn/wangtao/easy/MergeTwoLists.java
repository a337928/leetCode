package cn.wangtao.easy;

import java.util.Objects;

public class MergeTwoLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null){
			return null;
		}
		if (l1 == null){
			return l2;
		}
		if (l2 == null){
			return l1;
		}

		ListNode root = new ListNode();

		doMergeTwoLists(root, l1, l2);

		return root;



	}

	private void doMergeTwoLists(ListNode root, ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null){
			return;
		}
		if (l1 == null){
			root.val = l2.val;
			if (l2.next == null){
				return;
			}
			root.next = new ListNode();
			l2 = l2.next;
			doMergeTwoLists(root.next, l1, l2);
			return;
		}
		if (l2 == null){
			root.val = l1.val;
			if (l1.next == null){
				return;
			}
			root.next = new ListNode();
			l1 = l1.next;
			doMergeTwoLists(root.next, l1, l2);
			return;
		}

		if (l1.val > l2.val){
			root.val = l2.val;
			l2 = l2.next;
		} else {
			root.val = l1.val;
			l1 = l1.next;
		}

		root.next = new ListNode();
		doMergeTwoLists(root.next, l1, l2);
	}

	/**
	 * Definition for singly-linked list.
	 * */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public static void main(String[] args){
		MergeTwoLists mergeTwoLists = new MergeTwoLists();
		ListNode l1 = new ListNode();
		l1.val = -9;
		l1.next = new ListNode();
		l1.next.val = 3;
		ListNode l2 = new ListNode();
		l2.val = 5;
		l2.next = new ListNode();
		l2.next.val = 7;

		mergeTwoLists.mergeTwoLists(l1, l2);
	}
}


