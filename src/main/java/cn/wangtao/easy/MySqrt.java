package cn.wangtao.easy;

public class MySqrt {

	public int mySqrt(int x) {
		if (x == 0){
			return x;
		}

		int ans = (int) Math.exp(Math.log(x) / 2);
		return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
	}


	public static void main(String[] args){
		MySqrt mySqrt = new MySqrt();
		System.out.println(mySqrt.mySqrt(8));
	}
}
