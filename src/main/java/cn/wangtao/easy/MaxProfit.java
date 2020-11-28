package cn.wangtao.easy;

public class MaxProfit {
	public int maxProfit(int[] prices) {
		if (prices == null){
			return 0;
		}

		int minP = Integer.MAX_VALUE;
		int max = 0;
		for (int i = 0; i < prices.length; i ++){
			minP = Math.min(prices[i], minP);
			max = Math.max(max, prices[i] - minP);

		}

		return max;

	}

	public static void main(String[] args){
		MaxProfit maxProfit = new MaxProfit();
		int[] p = new int[] {2,5,1,3};
		System.out.println(maxProfit.maxProfit(p));

	}
}
