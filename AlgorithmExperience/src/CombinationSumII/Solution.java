package CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum2(int[] num, int target) {
		List<List<Integer>> retList = null;
		Arrays.sort(num);
		if (num.length == 0 || target < num[0]) {
			return retList;
		}
		retList = findAllCombination(num, target);
		return retList;
	}

	private List<List<Integer>> findAllCombination(int[] num, int target) {
		List<List<Integer>> retList = new ArrayList<List<Integer>>();
		int index = Arrays.binarySearch(num, target);
		if (index > 0) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(num[index]);
			retList.add(list);
		}
		if (index < 0) {
			index = -2 - index;
			if (index <= 0) {
				return retList;
			}
		}
		for (int i = 0; i < index; i++) {
			List<List<Integer>> subRetList = findAllCombination(num,
					(target - num[i]));
			if (subRetList == null || subRetList.size() == 0) {
				continue;
			}
			for (int j = 0; j < subRetList.size(); j++) {
				List<Integer> tmpList = subRetList.get(j);
				tmpList.add(num[i]);
				retList.add(tmpList);
			}
		}
		return retList;
	}
}
