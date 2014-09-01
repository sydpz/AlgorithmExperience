package WordBreak;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static void main(String args[]) {
		Solution solution = new Solution();
		solution.run();
	}

	private void run() {
		String input = "a";
		String dictItem = "b";
		Set<String> dict = new HashSet<String>();
		dict.add(dictItem);
		wordBreak(input, dict);
	}

	public boolean wordBreak(String s, Set<String> dict) {
		if (s == null || s.length() == 0 || dict.contains(s)) {
			return true;
		}
		if (dict == null || dict.isEmpty()) {
			return false;
		}
		boolean recordArray[] = new boolean[s.length()];
		for (int i = 0; i < recordArray.length; i++) {
			recordArray[i] = true;
		}
		for (int i = 0; i < s.length(); i++) {
			if (dict.contains(s.substring(0, i + 1))) {
				recordArray[i] = true;
				if (wordBreak(s, dict, i + 1, s.length() - 1, recordArray)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean wordBreak(String s, Set<String> dict, int start, int end,
			boolean[] recordArray) {
		if (dict.contains(s.substring(start, end + 1))) {
			return true;
		}
		for (int i = start; i < end; i++) {
			if (dict.contains(s.substring(start, i + 1))) {
				if (recordArray[start]
						&& wordBreak(s, dict, i + 1, end, recordArray)) {
					return true;
				}
			}
		}
		recordArray[start] = false;
		return false;
	}
}
