package SortColors;

public class Solution {
	public static void main(String[] args) {
		int[] A = { 1, 0 };
		sortColors(A);
	}

	public static void sortColors(int[] A) {
		if (A == null || A.length == 0) {
			return;
		}
		int redIndex = 0;
		int blueIndex = A.length - 1;
		int i = 0;
		while (i <= blueIndex) {
			if (A[i] == 0) {
				swap(A, i, redIndex);
				redIndex++;
				if (redIndex > i) {
					i++;
				}
			} else if (A[i] == 2) {
				swap(A, i, blueIndex);
				blueIndex--;
			} else {
				i++;
			}
		}
	}

	static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
