package ReverseInteger;

public class Solution {
    public int reverse(int x) {
        int ret = 0;
        boolean isPositive = true;
        if(x <0){
        	isPositive = false;
        	x = 0-x;
        }
        while(x!=0){
        	ret *= 10;
        	int remain = x%10;
        	ret += remain;
        	x /= 10;
       	
        }
        if(!isPositive){
        	ret = 0 - ret;
        }
        return ret;
    }
}
