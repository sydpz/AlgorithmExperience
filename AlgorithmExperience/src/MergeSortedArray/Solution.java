package MergeSortedArray;

public class Solution {
	public static void main(String[] args){
		Solution solution = new Solution();
		int[] A = new int[2];
		int[] B = new int[1];
		solution.merge(A, 0, B, 1);
	}
	public void merge(int A[], int m, int B[], int n) {
		int len = m + n - 1;
		int aLen = m;
		int bLen = n;
		int i = 0, j = 0;
		while (i < aLen && j < bLen) {
			if (A[aLen - 1 - i] < B[bLen - 1 - j]) {
				A[len] = B[bLen - 1 - j];
				j++;
			} else {
				A[len] = A[aLen - 1 - i];
				i++;
			}
			len--;
		}
		while (j < bLen) {
			A[len] = B[bLen - 1 - j];
			len--;
			j++;
		}
	}
}
