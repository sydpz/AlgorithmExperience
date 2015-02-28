package CountAndSay;

public class Solution {
	
	public static void main(String[] args){
		Solution solution = new Solution();
		solution.countAndSay(6);
	}
	
    public String countAndSay(int n) {
        String ret = "1";
        for(int i =1;i < n;i++){
	
        	ret = countString(ret);
        	//System.out.println(ret);
        }
        return ret;
    }

	private String countString(String sourceString) {
		StringBuffer sb = new StringBuffer();
		int index = 0;
		int hasRepeat = 0;
		char repeatItem = 0;
		while(index < sourceString.length()){
			char item = sourceString.charAt(index);
			if(hasRepeat !=0){
				if(item == repeatItem){
					hasRepeat ++;
				}else{
					sb.append(Integer.toString(hasRepeat));
					sb.append(repeatItem);
					hasRepeat = 1;
					repeatItem = item;
				}
			}else{
				hasRepeat = 1;
				repeatItem = item;
			}
			index ++;
		}
		if(hasRepeat != 0){
			sb.append(Integer.toString(hasRepeat));
			sb.append(repeatItem);
		}
		return sb.toString();
	}
}
