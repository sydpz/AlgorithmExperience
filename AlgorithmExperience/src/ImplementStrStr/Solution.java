package ImplementStrStr;

public class Solution {
	public int strStr(String haystack, String needle) {
		if (needle == null) {
			return -1;
		}
		if(needle.length() ==0){
			return 0;
		}
		
		for (int i = 0; i < haystack.length(); i++) {
			String subString = haystack.substring(i,
					Math.min(haystack.length(), i + needle.length()));
			if(subString.equals(needle)){
				return i;
			}
		}
		return -1;
	}
}
