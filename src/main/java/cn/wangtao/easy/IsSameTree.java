package cn.wangtao.easy;

import java.util.Objects;

public class IsSameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {
		return compare(p, q);
	}

	private boolean compare(TreeNode p, TreeNode q) {
		if (Objects.isNull(p) && Objects.nonNull(q)){
			return false;
		}

		if (Objects.isNull(q) && Objects.nonNull(p)){
			return false;
		}

		if (!Objects.equals(q.val, p.val)){
			return false;
		}

		if (Objects.isNull(q.left) && Objects.isNull(p.left)
				&& Objects.isNull(q.right) && Objects.isNull(p.right)){
			return true;
		}

		return compare(p.left, q.left) && compare(p.right, q.right);

	}

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
