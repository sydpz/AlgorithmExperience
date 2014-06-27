package SearchMatrix;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.run();

	}

	private void run() {
		int[][] matrix = { { 1,3,5,7},{10,11,16,20} };
		int target = 3;
		boolean ret = searchMatrix(matrix, target);
		System.out.println(ret);
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		int[] rowMatrix = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			rowMatrix[i] = matrix[i][0];
		}
		int index = Arrays.binarySearch(rowMatrix, target);
		if (index >= 0) {
			return true;
		}

		int insertLoc = -1 - index;
		if(insertLoc == 0){
			int columnIndex = Arrays.binarySearch(matrix[0], target);
			if (columnIndex >= 0) {
				return true;
			}
			return false;
		}
		int columnIndex = Arrays.binarySearch(matrix[insertLoc-1], target);
		if (columnIndex >= 0) {
			return true;
		}
		return false;
	}
}
