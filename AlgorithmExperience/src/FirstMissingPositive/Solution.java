package FirstMissingPositive;

public class Solution {
	public int firstMissingPositive(int[] A) {
		for (int i = 0; i < A.length; i++) {
			int value = A[i];
			boolean swapFlag = true;
			while (swapFlag) {
				if (value > 0 && value <= A.length && A[value - 1] != A[i]) {
					swap(A, value - 1, i);
					value = A[i];
				} else {
					swapFlag = false;
				}
				if (value - 1 == i) {
					swapFlag = false;
				}
			}

		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] != i + 1) {
				return (i + 1);
			}
		}
		return (A.length + 1);
	}

	public void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

}
