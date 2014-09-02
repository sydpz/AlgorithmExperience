package ReverseWordsInString;

public class Solution {
	public String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return s;
		}
		String[] wordList = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = wordList.length - 1; i >= 0; i--) {
			if (wordList[i] != null && wordList[i].length() != 0) {
				if (sb.length() == 0) {
					sb.append(wordList[i]);
				} else {
					sb.append(" ");
					sb.append(wordList[i]);
				}
			}
		}
		return sb.toString();
	}
}
