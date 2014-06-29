package Permute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.run();

	}

	private void run() {
		int[] numbers = { 0,1};
		permute(numbers);
		
	}

	public List<List<Integer>> permute(int[] num) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		computePermute(num, 0, num.length - 1, ret);
		return ret;
	}

	public void computePermute(int[] num, int start, int end,
			List<List<Integer>> ret) {
		if (start >= end) {
			List<Integer> itemList = new ArrayList<Integer>();
			for (int i = 0; i < num.length; i++) {
				itemList.add(num[i]);
				System.out.print(num[i] + " ");
			}
			System.out.println();
			ret.add(itemList);
			return;
		}
		for (int i = start; i <= end; i++) {
			swap(num, i, start);
			computePermute(num, start + 1, end, ret);
			swap(num, i, start);
		}
	}

	public void swap(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
}
