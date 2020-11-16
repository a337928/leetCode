package cn.wangtao.easy;

public class MaxDepth {
	public int maxDepth(TreeNode root) {
		return find(root, 0);


	}

	private int find(TreeNode treeNode, int depth) {
		if (treeNode == null){
			return depth;
		}
		depth ++;
		int left= find(treeNode.left, depth);

		int right = find(treeNode.right, depth);


		return Math.max(left, right);
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
