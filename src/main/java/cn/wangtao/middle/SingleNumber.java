package cn.wangtao.middle;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		int s = 0, m = 0;
		for (int num : nums ){
			s = ~m & (s ^ num);
			m = ~s & (m ^ num);
		}
		return s;
	}
}
