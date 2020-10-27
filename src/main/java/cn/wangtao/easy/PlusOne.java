package cn.wangtao.easy;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int last;

		for (int i = digits.length - 1; i > -1 ; i -- ){
			last = digits[i];
			last ++ ;
			if (last < 10){
				digits[i] = last;
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		for (int i = 1; i < result.length; i ++){
			result[i] = 0;
		}
		return result;
	}
}
