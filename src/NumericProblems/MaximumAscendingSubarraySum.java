package NumericProblems;
/*
Given an array of positive integers nums, return the maximum possible sum of an ascending
subarray in nums.

A subarray is defined as a contiguous sequence of numbers in an array.

A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r,
numsi < numsi+1. Note that a subarray of size 1 is ascending.

Example 1:

Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.

 */
public class MaximumAscendingSubarraySum {
    public static int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                sum = sum+nums[i];
                maxSum = Math.max(sum, maxSum);
            }else{
                maxSum = Math.max(sum, maxSum);
                sum = nums[i];
            }
        }
        return Math.max(sum, maxSum);
    }
    public static void main(String[] args){
        int[] nums = {10,20,30,5,10,50};

        System.out.println(maxAscendingSum(nums));
    }
}
