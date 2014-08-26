package Combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<List<Integer>> combine(int n, int k) {
		if (n <= 0 || k <= 0 || k > n) {
			return null;
		}
		List<Integer> inputList = new ArrayList<Integer>();

		List<List<Integer>> retList = findCombine(1, n, k, inputList);

		return retList;
	}

	private List<List<Integer>> findCombine(int startIndex, int end,
			int number, List<Integer> inputList) {
		List<List<Integer>> retList = new ArrayList<List<Integer>>();
		if (number == 0) {
			List<Integer> tmpList = new ArrayList<Integer>();
			tmpList.addAll(inputList);
			retList.add(tmpList);
			return retList;
		}
		if (number == (end - startIndex + 1)) {
			List<Integer> tmpList = new ArrayList<Integer>();
			tmpList.addAll(inputList);
			for (int i = startIndex; i <= end; i++) {
				tmpList.add(i);
			}
			retList.add(tmpList);
			return retList;
		}
		List<Integer> noContainIndexList = new ArrayList<Integer>();
		List<Integer> containIndexList = new ArrayList<Integer>();
		noContainIndexList.addAll(inputList);
		containIndexList.addAll(inputList);
		containIndexList.add(startIndex);
		List<List<Integer>> retListSet = findCombine(startIndex + 1, end,
				number, noContainIndexList);
		retListSet.addAll(findCombine(startIndex + 1, end, number - 1,
				containIndexList));
		return retListSet;
	}
}
