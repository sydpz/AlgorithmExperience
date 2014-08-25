package LongestSubstringWithoutRepeatingCharacters;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int[] locateCache = new int[256];
		for (int i = 0; i < locateCache.length; i++) {
			locateCache[i] = -1;
		}
		int startIndex = 0;
		int curLength = 1;
		int maxLength = 1;
		locateCache[s.charAt(0)] = 0;
		for (int i = 1; i < s.length(); i++) {
			if (locateCache[s.charAt(i)] >= startIndex) {
				startIndex = locateCache[s.charAt(i)] + 1;
				locateCache[s.charAt(i)] = i;
				if (curLength > maxLength) {
					maxLength = curLength;
				}
				curLength = i - startIndex + 1;
			} else {
				locateCache[s.charAt(i)] = i;
				curLength++;
			}
		}
		if (curLength > maxLength) {
			maxLength = curLength;
		}
		return maxLength;
	}
}
