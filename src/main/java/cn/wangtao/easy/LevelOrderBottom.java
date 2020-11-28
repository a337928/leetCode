package cn.wangtao.easy;

import java.util.*;

public class LevelOrderBottom {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new LinkedList<>();
		if (root == null){
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()){
			List<Integer> level = new ArrayList<>();
			int count = queue.size();
			for (int i = 0; i < count; i ++){
				TreeNode node = queue.poll();
				level.add(node.val);
				if (node.left != null){
					queue.offer(node.left);
				}
				if (node.right != null){
					queue.offer(node.right);
				}
			}
			result.add(0, level);
		}

		return result;
	}



	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
