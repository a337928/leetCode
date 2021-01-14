package cn.wangtao.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetRow {

	public List<Integer> getRow(int rowIndex) {

		Integer[] result = new Integer[rowIndex + 1];

		result[0] = 1;

		for (int i = 1; i <= rowIndex; i ++ ){
			result[i] = result[i - 1] * (rowIndex - 1 + i) / i ;
		}

		return Arrays.asList(result);
	}
}
