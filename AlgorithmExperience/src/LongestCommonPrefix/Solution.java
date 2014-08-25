package LongestCommonPrefix;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		String retString = strs[0];

		for (int i = 0; i < strs.length; i++) {
			retString = computeCommonPrefix(retString, strs[i]);
		}

		return retString;
	}

	private String computeCommonPrefix(String str1, String str2) {
		int strLength1 = str1.length();
		int strLength2 = str2.length();
		int index = 0;
		for (int i = 0; i < Math.min(strLength1, strLength2); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				break;
			}
			index ++;
		}
		String retStr = str1.substring(0, index);
		return retStr;
	}
}
