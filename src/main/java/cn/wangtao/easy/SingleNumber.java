package cn.wangtao.easy;

public class SingleNumber {

	public int singleNumber(int[] nums) {
		int s = 0;
		for (int num : nums){
			s = s ^ num;
		}
		return s;
	}
}
