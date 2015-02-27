package FindPeakElement;

public class Solution {
	public int findPeakElement(int[] num) {
		if (num == null || num.length == 0 || num.length == 1) {
			return 0;
		}

		int low = 0;
		int high = num.length - 1;
		int middle = (high - low) / 2 + low;
		while (low <= high) {
			middle = (high - low) / 2 + low;
			if (isPeak(num, middle)) {
				return middle;
			}
			if (num[middle] > num[low]) {
				low = middle + 1;
			} else if (num[middle] > num[high]) {
				high = middle - 1;
			} else  {
				low = low + 1;
			}
		}
		return middle;
	}

	private boolean isPeak(int[] num, int middle) {
		if (middle == 0) {
			if (num[0] > num[1]) {
				return true;
			}
			return false;
		}
		if (middle == num.length - 1) {
			if (num[middle] > num[middle - 1]) {
				return true;
			}
			return false;
		}

		if (num[middle] > num[middle - 1] && num[middle] > num[middle + 1]) {
			return true;
		}
		return false;
	}
}
