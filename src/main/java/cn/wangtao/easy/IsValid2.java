package cn.wangtao.easy;

public class IsValid2 {

	private static String min = "()";

	private static String middle = "[]";

	private static String big = "{}";


	public boolean isValid(String s) {

		int length = s.length();
		int num = 0;
		while (( num == 0 || length > s.length()) && s.length() != 0) {
			num ++ ;
			length = s.length();
			s = s.replace(min, "")
					.replace(middle, "")
					.replace(big, "");
		}

		return s.length() == 0;

	}


	public static void main(String[] args){
		IsValid2 isValid = new IsValid2();
		System.out.println(isValid.isValid("[{()]}"));
	}
}
