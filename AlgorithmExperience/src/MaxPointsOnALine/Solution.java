package MaxPointsOnALine;

import DataStructure.Point;

public class Solution {
	public int maxPoints(Point[] points) {
		int maxSum = 0;
		if (points == null) {
			return 0;
		}
		if (points.length <= 2) {
			return points.length;
		}
		boolean[][] retArray = new boolean[points.length][points.length];
		for (int i = 0; i < retArray.length; i++) {
			for (int j = 0; j < retArray[0].length; j++) {
				retArray[i][j] = false;
			}
		}
		for (int i = 0; i < retArray.length; i++) {
			
			for (int j = 0; j < retArray[0].length; j++) {
				if (i != j && !retArray[i][j]) {
					
				 }
			}
		}

		return maxSum;
	}
}
