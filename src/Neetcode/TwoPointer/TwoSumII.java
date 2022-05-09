package Neetcode.TwoPointer;

import java.util.Arrays;

public class TwoSumII {
    public static int[] twoSumII(int[] nums, int target){
        int a = 0;
        int b = nums.length-1;

        while(a<b){
            int sum = nums[a]+nums[b];
            if(sum == target){
                return new int[]{a+1, b+1};
            }else if(sum>target){
                b--;
            }else{
                a++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        System.out.println("Two Sum II: "+ Arrays.toString(twoSumII(new int[]{2,7,11,15}, 9)));
        System.out.println("Two Sum II: "+ Arrays.toString(twoSumII(new int[]{2,3,4}, 6)));
    }
}
