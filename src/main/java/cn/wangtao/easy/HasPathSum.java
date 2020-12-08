package cn.wangtao.easy;

public class HasPathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null){
			return Boolean.FALSE;
		}

		int nodeSum = root.val;

		if (root.right == null && root.left == null){
			return nodeSum == sum;
		}

		return hasPathSum(root.left, sum, root.val) || hasPathSum(root.right, sum, root.val);

	}

	public boolean hasPathSum(TreeNode root, int sum, int nodeSum) {
		if (root == null){
			return Boolean.FALSE;
		}

		nodeSum += root.val;

		if (root.right == null && root.left == null){
			return nodeSum == sum;
		}

		return hasPathSum(root.left, sum, nodeSum) || hasPathSum(root.right, sum, nodeSum);

	}
}
