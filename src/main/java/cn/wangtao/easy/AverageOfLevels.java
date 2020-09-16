package cn.wangtao.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AverageOfLevels {

	public List<Double> averageOfLevels(TreeNode root) {
		List<Integer> counts = new ArrayList<>();
		List<Double> sum = new ArrayList<>();
		match(root, 0, counts, sum);
		List<Double> result = new LinkedList<>();
		for(int i = 0; i < counts.size(); i ++  ){
			result.add((sum.get(i) / counts.get(i)));
		}

		return result;

	}

	private void match(TreeNode root, int level ,List<Integer> counts, List<Double> sum) {
		if (root == null){
			return;
		}
		if (null == counts.get(level)){
			counts.add(1);
			sum.add((double) root.val);
		} else {
			counts.set(level, counts.get(level) + 1);
			sum.set(level, sum.get(level) + root.val);
		}

		level ++;
		if (root.left != null){
			match(root.left,  level, counts, sum);
		}

		if (root.right != null){
			match(root.right, level, counts, sum);
		}
	}

	public  class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}



