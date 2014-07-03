package SearchInsertPosition;

public class Solution {
	public int searchInsert(int[] A, int target) {
		int insertLoc = 0;
		int i = 0;
		int j = A.length;
		if (A.length == 0 || target < A[0]) {
			return 0;
		} else if (target > A[A.length - 1]) {
			return A.length;
		}
		while (i <= j) {
			insertLoc = (j - i) / 2 + i;
			if (A[insertLoc] == target) {
				return insertLoc;
			} else if (A[insertLoc] > target) {
				j = insertLoc - 1;
			} else {
				i = insertLoc + 1;
				insertLoc = i;
			}
		}
		return insertLoc;
	}
}
