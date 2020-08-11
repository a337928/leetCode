package cn.wangtao.easy;

public class Reverse {

	public static void main(String[] args){
		System.out.println(reverse(1003));
	}

	private static Integer reverse(int x){
		int result = 0;
		int max = Integer.MAX_VALUE / 10;
		int min = Integer.MIN_VALUE / 10;
		while (x != 0){
			int pop = x % 10;
			if (x > max || x < min){
				return 0;
			}

			if ((x == max && pop > 7) || (x == min && pop < -8)){
				return 0;
			}


			result = result * 10 + pop;
			x = x / 10;

		}
		return result;
	}
}
