package cn.wangtao.easy;

import java.util.LinkedList;
import java.util.List;

public class sumOfLeftLeaves {

	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null){
			return 0;
		}

		List<Integer> sum = new LinkedList<>();
		dfs(root, sum, false);

		return sum.stream().mapToInt(Integer::intValue).sum();

	}

	private void dfs(TreeNode root, List<Integer> sum, boolean isLeft) {

		if (root == null){
			return;
		}

		if (isLeft && root.left == null && root.right == null){
			sum.add(root.val);
			return;
		}

		if (root.left != null){
			dfs(root.left, sum, true);
		}

		if (root.right != null){
			dfs(root.right, sum, false);
		}

	}

	public  class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
