package ExcelSheetColumnNumber;

public class Solution {
	public int titleToNumber(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int retVal = 0;
		for (int i = 0; i < s.length(); i++) {
			char val = s.charAt(i);
			int num = val - 'A' + 1;
			retVal *= 26;
			retVal += num;
		}
		return retVal;
	}
}
