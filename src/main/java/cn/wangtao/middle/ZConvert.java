package cn.wangtao.middle;

import java.util.Arrays;

public class ZConvert {

	public static void main(String[] args){

		System.out.println(convert("ABCDEFGHIJKLMN", 4));

	}

	public static String convert(String s, Integer numRows){
		if (numRows <= 1){
			return s;
		}
		String[] rows = new String[numRows];
		Arrays.fill(rows, "");
		int t = 2 * numRows - 2;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i ++){
			int row = i % t;
			if (row < numRows){
				rows[row] += c[i];
			}else {
				rows[t - row] += c[i];
			}
		}

		StringBuilder sb = new StringBuilder();
		for (String r : rows){
			sb.append(r);
		}
		return sb.toString();
	}
}
