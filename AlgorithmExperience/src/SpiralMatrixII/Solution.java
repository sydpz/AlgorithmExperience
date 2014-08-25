package SpiralMatrixII;

public class Solution {
	enum Direct {
		LEFT, RIGHT, UP, DOWN
	};

	class Croods {
		int x;
		int y;
		Direct direct;

		public Croods(int x, int y, Direct direct) {
			this.x = x;
			this.y = y;
			this.direct = direct;
		}
	}

	public int[][] generateMatrix(int n) {

		if (n <0) {
			return null;
		}
		int[][] retArray = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				retArray[i][j] = -1;
			}
		}
		Croods croods = new Croods(0, 0, Direct.RIGHT);
		int end = n * n;
		for (int number = 1; number <= end; number++) {
			retArray[croods.x][croods.y] = number;
			computeNextCroods(retArray, croods);
		}
		return retArray;
	}

	private void computeNextCroods(int[][] retArray, Croods croods) {
		if (croods.direct == Direct.RIGHT) {
			if (croods.y != (retArray.length - 1)
					&& retArray[croods.x][croods.y + 1] == -1) {
				croods.y++;
			} else {
				croods.direct = Direct.DOWN;
				croods.x++;
			}
			return;
		}
		if (croods.direct == Direct.LEFT) {
			if (croods.y != 0 && retArray[croods.x][croods.y - 1] == -1) {
				croods.y--;
			} else {
				croods.direct = Direct.UP;
				croods.x--;
			}
			return;
		}
		if (croods.direct == Direct.UP) {
			if (croods.x != 0 && retArray[croods.x - 1][croods.y] == -1) {
				croods.x--;
			} else {
				croods.direct = Direct.RIGHT;
				croods.y++;
			}
			return;
		}
		if (croods.direct == Direct.DOWN) {
			if (croods.x != (retArray.length - 1)
					&& retArray[croods.x + 1][croods.y] == -1) {
				croods.x++;
			} else {
				croods.direct = Direct.LEFT;
				croods.y--;
			}
			return;
		}
	}
}
