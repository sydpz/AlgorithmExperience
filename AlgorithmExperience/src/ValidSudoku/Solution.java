package ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			if (!validRow(board, i) || !validCol(board, i)
					|| !validSquar(board, i)) {
				return false;
			}
		}

		return true;
	}

	private boolean validSquar(char[][] board, int index) {
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < 9; i++) {
			if (board[index / 3 *3 + i / 3][index % 3 * 3 + i % 3] == '.') {
				continue;
			}
			if (set.contains(board[index / 3 *3 + i / 3][index % 3 * 3 + i % 3])) {
				return false;
			}
			set.add(board[index / 3 *3+ i / 3][index % 3 * 3 + i % 3]);
		}
		return true;
	}

	private boolean validRow(char[][] board, int index) {
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < 9; i++) {
			if (board[index][i] == '.') {
				continue;
			}
			if (set.contains(board[index][i])) {
				return false;
			}
			set.add(board[index][i]);
		}
		return true;
	}

	private boolean validCol(char[][] board, int index) {
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < 9; i++) {
			if (board[i][index] == '.') {
				continue;
			}
			if (set.contains(board[i][index])) {
				return false;
			}
			set.add(board[i][index]);
		}
		return true;
	}
}
