package MinimumPathSum;

public class Solution {
	public int minPathSum(int[][] grid) {
		int height = grid.length;
		if (height == 0) {
			return 0;
		}
		int width = grid[0].length;
		if (width == 0) {
			return 0;
		}
		int[][] sumArray = new int[height][width];
		sumArray[0][0] = grid[0][0];
		for (int i = 1; i < height; i++) {
			sumArray[i][0] = sumArray[i - 1][0] + grid[i][0];
		}
		for (int j = 1; j < width; j++) {
			sumArray[0][j] = sumArray[0][j - 1] + grid[0][j];
		}
		for (int i = 1; i < height; i++) {
			for (int j = 1; j < width; j++) {
				int minValue = Math.min(sumArray[i - 1][j], sumArray[i][j - 1]);
				sumArray[i][j] = minValue + grid[i][j];
			}
		}
		return sumArray[height - 1][width - 1];
	}
}
