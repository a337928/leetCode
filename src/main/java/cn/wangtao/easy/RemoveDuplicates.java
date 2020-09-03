package cn.wangtao.easy;

import java.util.*;

public class RemoveDuplicates {

	private Set<Integer> set;
	public int removeDuplicates(int[] nums) {
		if (Objects.isNull(nums) || nums.length == 0){
			return 0;
		}

		set = new HashSet<>();
		for (int num : nums){
			set.add(num);
		}
		Iterator<Integer> iterator = set.iterator();
		int[] nums2 = new int[set.size()];
		for (int i = 0; i < nums2.length; i ++){
			nums2[i] = iterator.next();
		}

		return nums2.length;

	}


	public static void main(String[] args){
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		removeDuplicates.removeDuplicates(new int[]{1, 1, 3});
	}
}
