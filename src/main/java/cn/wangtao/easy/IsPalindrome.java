package cn.wangtao.easy;

import java.util.Objects;

public class IsPalindrome {

	public boolean isPalindrome(String s) {
			if( s == null){
				return Boolean.FALSE;
			}

			StringBuilder volidStr = new StringBuilder();
			for (int i = 0; i < s.length(); i ++){
				if (Character.isLetterOrDigit(s.charAt(i))){
					volidStr.append(Character.toLowerCase(s.charAt(i)));
				}
			}

			String ss = new StringBuffer(volidStr).reverse().toString();
			return Objects.equals(volidStr.toString(), ss);


	}


	public static void main(String[] args){
		IsPalindrome isPalindrome = new IsPalindrome();

		isPalindrome.isPalindrome("race a car");
	}
}
