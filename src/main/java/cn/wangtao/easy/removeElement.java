package cn.wangtao.easy;

import java.util.Objects;

public class removeElement {
	public int removeElement(int[] nums, int val) {
		int newIndex = 0;
		for (int i = 0; i < nums.length; i ++){
			if(!Objects.equals(nums[i], val)){
				nums[newIndex] = nums[i];
				newIndex ++;
			}
		}
		return newIndex;
	}
}
