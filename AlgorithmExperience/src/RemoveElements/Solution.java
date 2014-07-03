package RemoveElements;

public class Solution {
	public int removeElement(int[] A, int elem) {
		int newLength = 0;
		for (int i = 0; i < A.length; i++) {
			if (elem != A[i]) {
				A[newLength] = A[i];
				newLength++;
			}
		}
		return newLength;
	}
}
