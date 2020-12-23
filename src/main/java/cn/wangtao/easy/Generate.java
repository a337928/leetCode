package cn.wangtao.easy;

import java.util.ArrayList;
import java.util.List;

public class Generate {
	public List<List<Integer>> generate(int numRows) {
		if (numRows == 0){
			return new ArrayList<>(numRows);
		}
		List<List<Integer>> result = new ArrayList<>(numRows);

		List<Integer> lastList = null;
		for (int i = 1; i <= numRows; i ++){
			if (i == 1){
				lastList = new ArrayList<>(i);
				lastList.add(i);
				result.add(lastList);
				continue;
			}

			int index = 0;
			List<Integer> newList = new ArrayList<>(i);
			while (index < i){

				int old1 = (index - 1) > 0 ? lastList.get(index - 1) : 0;
				int old2 = index < lastList.size() ? lastList.get(index) : 0;

				newList.add(old1 + old2);
				index ++;
			}
			result.add(newList);
			lastList = newList;

		}

		return result;
	}
}
