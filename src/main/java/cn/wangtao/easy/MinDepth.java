package cn.wangtao.easy;

import java.util.Objects;

public class MinDepth {
	public int minDepth(TreeNode root) {
		if (root == null){
			return 0;
		}

		if (root.left == null && root.right == null){
			return 1;
		}

		int depth = Integer.MAX_VALUE;
		if (root.left != null){
			depth = Math.min(minDepth(root.left), depth);
		}

		if (root.right != null){
			depth = Math.min(minDepth(root.right), depth);
		}

		return depth + 1;
	}

	private int recur(TreeNode root) {
		if (Objects.isNull(root)){
			return 0;
		}

		return  Math.min(recur(root.left), recur(root.right)) + 1;
	}
}
