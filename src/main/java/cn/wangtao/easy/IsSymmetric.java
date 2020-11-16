package cn.wangtao.easy;

import java.util.Objects;

public class IsSymmetric {
	public boolean isSymmetric(TreeNode root) {
		return check(root, root);

	}

	private boolean check(TreeNode left, TreeNode right) {
		if (left == null && right == null){
			return true;
		}

		if (left == null || right == null){
			return false;
		}

		return Objects.equals(left.val, right.val) && check(left.left, right.right) && check(left.right, right.left);

	}

	public class TreeNode {
      	int val;
      	TreeNode left;
      	TreeNode right;
      	TreeNode(int x) { val = x; }
  	}
}
