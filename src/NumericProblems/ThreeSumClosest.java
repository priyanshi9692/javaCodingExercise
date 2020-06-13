package NumericProblems;
/*
16. 3Sum Closest

Given an array nums of n integers and an integer target,
find three integers in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target){
        int result = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum<target){
                    start++;
                }else{
                    end--;
                }
                if(Math.abs(sum-target)<Math.abs(result-target)){
                    result = sum;
                }
            }

        }
        return result;
    }
    public static void main(String[] args){
        ThreeSumClosest obj = new ThreeSumClosest();
        int [] arr = {-1,2,1,-4};
        System.out.println(obj.threeSumClosest(arr, 4));
    }
}
