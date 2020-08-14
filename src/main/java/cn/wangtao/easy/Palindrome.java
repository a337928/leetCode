package cn.wangtao.easy;

public class Palindrome {

	public static void main(String[] args){
		System.out.println(isPalindrome(1003));
	}

	private static Boolean isPalindrome(int x){

		if (x < 0 || ( x % 10 == 0 && x != 0)){
			return Boolean.FALSE;
		}

		int result = 0;
		while (x > result){
			result = x % 10 + result * 10;
			x = x / 10;

		}
		return result == x || x == result / 10;
	}
}
