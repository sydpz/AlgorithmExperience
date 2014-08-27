package SimplifyPath;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String args[]) {
		Solution solution = new Solution();
		solution.run();
	}

	private void run() {
		String path = "/a/./b///../c/../././../d/..//../e/./f/./g/././//.//h///././/..///";
		System.out.println(simplifyPath(path));
	}

	public String simplifyPath(String path) {
		String retString = "";
		if (path == null || path.length() == 0) {
			return retString;
		}

		String[] contentList = path.split("/");
		List<String> retSpaceList = new ArrayList<String>();
		for (int i = 0; i < contentList.length; i++) {
			if (!contentList[i].equals(".")) {
				if (contentList[i].equals("..")) {
					if (retSpaceList.size() != 0) {
						retSpaceList.remove(retSpaceList.size() - 1);
					}
				} else if(!contentList[i].equals("")) {
					retSpaceList.add(contentList[i]);
				}
			}
		}

		for (int i = 0; i < retSpaceList.size(); i++) {
			if (!retSpaceList.get(i).equals("")) {
				retString += ("/" + retSpaceList.get(i));
			}
		}
        if(retString.equals("")){
            return "/";
        }
		return retString;
	}
}
