package cn.wangtao.middle.cn.wangtao.middle;

import java.util.Objects;

public class SortedListToBST {

	public TreeNode sortedListToBST(ListNode head) {
		return buildToTree(head, null);
	}

	private TreeNode buildToTree(ListNode head, ListNode slow) {
		if (Objects.equals(head, slow)){
			return null;
		}

		ListNode mid = getMiddle(head, slow);
		TreeNode root = new TreeNode(mid.val);
		root.left = buildToTree(head, mid);
		root.right = buildToTree(mid.next, slow);
		return root;

	}

	private ListNode getMiddle(ListNode head, ListNode slow) {
		ListNode left = head;
		ListNode right = head;
		while ( left != slow && right != slow ){
			left = left.next.next;
			right = right.next;
		}

		return right;

	}


	/**
	 * Definition for singly-linked list.
	 * */
	 public class ListNode {
		  int val;
		  ListNode next;
		  ListNode() {}
		  ListNode(int val) { this.val = val; }
		  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }

	/**
	 * Definition for a binary tree node.
	 * */
	public class TreeNode {
	  int val;
	  TreeNode left;
	  TreeNode right;
	  TreeNode() {}
	  TreeNode(int val) { this.val = val; }
	  TreeNode(int val, TreeNode left, TreeNode right) {
		  this.val = val;
		  this.left = left;
		  this.right = right;
	  }
	}

}
