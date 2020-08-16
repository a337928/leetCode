package cn.wangtao.easy;

public class FloodFill {

	public static void main(String[] args){
//		System.out.println(floodFill(1003));
	}


	private int oldColor;
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		oldColor = image[sr][sc];
		if(oldColor == newColor){
			return image;
		}
		dsf(image, sr , sc, newColor);
		return image;
	}


	public   void dsf(int[][] image, int sr, int sc, int newColor) {
		if (sr < 0 || sr >= image.length || sc <0 || sc >= image[0].length || image[sr][sc] != oldColor){
			return;
		}
		image[sr][sc] = newColor;
		dsf(image, sr + 1, sc, newColor);
		dsf(image, sr - 1, sc, newColor);
		dsf(image, sr, sc + 1, newColor);
		dsf(image, sr, sc - 1, newColor);
	}

}
