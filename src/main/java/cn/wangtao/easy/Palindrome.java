package cn.wangtao.easy;

public class Palindrome {

	public static void main(String[] args){
		System.out.println(isPalindrome(1003));
	}

	private static Boolean isPalindrome(int x){
		int result = 0;
		while (x != 0){
			int pop = x % 10;
			result = result * 10 + pop;
			x = x / 10;

		}
		return result == x;
	}
}
