package TwoSum;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.run();

	}

	private void run() {
		int[] numbers = { 3,2,4};
		int target = 6;
		int[] ret = twoSum(numbers, target);
		System.out.println(ret[0]+" "+ ret[1]);
	}

	public int[] twoSum(int[] numbers, int target) {
		int[] ret = new int[2];
		int i = 0;
		int j = numbers.length - 1;
		int[] sortNumbers = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(sortNumbers);
		while (i < j) {
			if (sortNumbers[i] + sortNumbers[j] < target) {
				i++;
			} else if (sortNumbers[i] + sortNumbers[j] > target) {
				j--;
			} else {
				break;
			}
		}
		int smallNumber = sortNumbers[i];
		int largeNumber = sortNumbers[j];
		boolean findOne = false;
		for(int index =0 ; index < numbers.length;index++){
			if(numbers[index] == smallNumber || numbers[index] == largeNumber){
				if(findOne){
					ret[1] = index+1;
				}else{
					ret[0] = index+1;
					findOne = true;
				}
			}
		}
		return ret;
	}
}
