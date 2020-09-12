package cn.wangtao.easy;

import javax.management.remote.rmi._RMIConnection_Stub;
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

		Deque<Character> stack = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			char right  = getRight(s.charAt(i));
			if (right != 0) {
				stack.push(right);
				continue;
			}
			if (stack.isEmpty() || !stack.peek().equals(s.charAt(i))){
				return false;
			} else {
				stack.pop();
			}

		}
		return stack.isEmpty();

	}

	private char getRight(char left){
		switch (left){
			case 40 :
				return (char)41;
			case 91 :
				return  (char)93;
			case 123 :
				return  (char)125;
			default:
				return 0;
		}
	}


	public static void main(String[] args){
		IsValid isValid = new IsValid();
		System.out.println(isValid.isValid("{}[]()"));
	}
}
