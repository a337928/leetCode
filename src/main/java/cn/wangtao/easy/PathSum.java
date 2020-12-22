package cn.wangtao.easy;

import java.util.*;

public class PathSum {
	List<List<Integer>> result = new LinkedList<>();
	Deque<Integer> path = new LinkedList<Integer>();


	public List<List<Integer>> pathSum(TreeNode root, int sum) {

		dfs(root.left, sum);


		return result;
	}


	public void dfs(TreeNode root, int sum) {
		if (root == null){
			return ;
		}

		path.offerLast(root.val);

		int lastSum = sum - root.val;
		if (root.left == null && root.right == null){
			if (lastSum == 0){
				result.add(new LinkedList<>(path));
			}
			return;
		}

		if (root.left != null){
			dfs(root.left, lastSum);
		}

		if (root.right != null){
			dfs(root.right, lastSum);
		}
		path.pollLast();

	}
}
