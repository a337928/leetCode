package cn.wangtao.easy;

public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {
		if (s == null || "".equals(s)){
			return 0;
		}

		char ss = " ".charAt(0);
		char[] sArray = s.toCharArray();
		for (int i = sArray.length - 1; i >= 0 ; i --){
			if (sArray[i] == ss){
				return sArray.length - i - 1 ;
			}
		}

		return sArray.length;
	}


	public static void main(String[] args){
		LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
		lengthOfLastWord.lengthOfLastWord("a");
	}
}
