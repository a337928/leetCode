package cn.wangtao.easy;


import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	private Map<String, Integer> romanMapInt;

	private Map<String, Integer> romanMapIntExt;

	private void init(){
		romanMapInt = new HashMap<>();
		romanMapInt.put("I", 1);
		romanMapInt.put("V", 5);
		romanMapInt.put("X", 10);
		romanMapInt.put("L", 50);
		romanMapInt.put("C", 100);
		romanMapInt.put("D", 500);
		romanMapInt.put("M", 1000);

		romanMapIntExt = new HashMap<>();
		romanMapIntExt.put("IV", 4);
		romanMapIntExt.put("IX", 9);
		romanMapIntExt.put("XL", 40);
		romanMapIntExt.put("XC", 90);
		romanMapIntExt.put("CD", 400);
		romanMapIntExt.put("CM", 900);
	}

	public int romanToInt(String s) {
		init();
		return matchRoman(s);
	}

	private int matchRoman(String s) {
		int result = 0;
		for (Map.Entry<String, Integer> entry : romanMapIntExt.entrySet()){
			if ("".equals(s)){
				return result;
			}
			if(!s.contains(entry.getKey())){
				continue;
			}
			result += entry.getValue();
			s = s.replace(entry.getKey(), "");
		}

		if(s == null || "".equals(s)){
			return result;
		}

		for (Map.Entry<String, Integer> entry : romanMapInt.entrySet()){
			if ("".equals(s)){
				return result;
			}
			while (s.contains(entry.getKey())){
				result += entry.getValue();
				s = s.replaceFirst(entry.getKey(), "");
			}
		}
		return result;

	}

	public static void main(String[] args){
		RomanToInt romanToInt = new RomanToInt();
		System.out.println(romanToInt.romanToInt("III"));
	}
}
