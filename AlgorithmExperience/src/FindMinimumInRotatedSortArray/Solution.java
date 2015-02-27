package FindMinimumInRotatedSortArray;

public class Solution {
	public int findMin(int[] num) {
		if (num == null) {
			return 0;
		}
		int start = 0;
		int end = num.length - 1;
		int middle = (end - start) / 2 + start;
		while (start < end) {
			if(middle == 0){
				if(num[0] > num[1]){
					return num[1];
				}else{
					return num[0];
				}
			}
			if(num[middle] < num[middle-1]){
				 break;
			}else{
				if(num[middle] >= num[start] && num[start] > num[end]){
					start = middle+1;
				}else{
					end = middle -1;
				}
			}
						middle =  (end - start) / 2 + start;
		}
		return num[middle] ;
	}
}
