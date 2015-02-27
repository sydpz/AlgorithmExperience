package SetMatrixZeroes;

public class Solution {
	public void setZeroes(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return;
		}
		boolean[] rowRecord = new boolean[matrix.length];

		boolean[] colRecord = new boolean[matrix[0].length];
		for (int i = 0; i < rowRecord.length; i++) {
			rowRecord[i] = false;
		}
		for (int i = 0; i < colRecord.length; i++) {
			colRecord[i] = false;
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					rowRecord[i] = true;
					colRecord[j] = true;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (rowRecord[i] || colRecord[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}
}
