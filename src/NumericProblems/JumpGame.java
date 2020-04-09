package NumericProblems;
/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Determine if you are able to reach the last index.
 */

public class JumpGame {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0){
            return true;
        }
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
    public static void main(String [] args){
        JumpGame obj = new JumpGame();
        int [] arr = {2,3,1,1,4};
        System.out.println(obj.canJump(arr));
    }
}
