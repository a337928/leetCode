package cn.wangtao.easy;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IsValid {

	public boolean isValid(String s) {

		int n = s.length();
		if (n % 2 == 1) {
			return false;
		}

		Map<Character, Character> pairs = new HashMap<Character, Character>() {{
			put(')', '(');
			put(']', '[');
			put('}', '{');
		}};
		Deque<Character> stack = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (pairs.containsKey(ch)) {
				if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
					return false;
				}
				stack.pop();
			} else {
				stack.push(ch);
			}
		}
		return stack.isEmpty();

	}


	public static void main(String[] args){
		IsValid isValid = new IsValid();
		System.out.println(isValid.isValid("[{()]}"));
	}
}
