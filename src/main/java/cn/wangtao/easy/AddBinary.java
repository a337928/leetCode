package cn.wangtao.easy;

import java.util.Objects;

public class AddBinary {

	public String addBinary(String a, String b) {
		int len = Math.max(a.length(), b.length());
		StringBuilder result = new StringBuilder();
		char[] one = "1".toCharArray();
		boolean last = false;
		a = new StringBuilder(a).reverse().toString();
		b = new StringBuilder(b).reverse().toString();
		for (int i = 0; i < len ; i ++){
			boolean ab = a.length() > i  && Objects.equals(a.charAt(i), one[0]);
			boolean bb = b.length() > i && Objects.equals(b.charAt(i), one[0]);
			if (last){
				if (ab && bb){
					result.append("1");
					last = true;
				}else if (ab || bb){
					result.append("0");
					last = true;
				} else {
					result.append("1");
					last = false;
				}
			} else {
				if (ab && bb){
					result.append("0");
					last = true;
				}else if (ab || bb){
					result.append("1");
					last = false;
				} else {
					result.append("0");
					last = false;
				}
			}
		}
		if (last){
			result.append(1);
		}
		return result.reverse().toString();
	}

	public static void main(String[] args){
		AddBinary addBinary = new AddBinary();
		addBinary.addBinary("11", "1");
	}
}
