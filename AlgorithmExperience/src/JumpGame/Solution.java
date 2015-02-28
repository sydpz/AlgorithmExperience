package JumpGame;

public class Solution {
    public boolean canJump(int[] A) {
        int[] jumpArray = new int[A.length];
        jumpArray[0] = A[0];
        for(int i =0;i < A.length-1;i++){
            if(i == 0){
                jumpArray[i] = A[i] -1;
            }else{
                   	jumpArray[i] = Math.max(jumpArray[i-1],A[i]) -1;     
            }

        	if(jumpArray[i] < 0){
        		return false;
        	}
        }
    	return true;
    }
}
