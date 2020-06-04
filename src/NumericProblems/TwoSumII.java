package NumericProblems;
/*
167. Two Sum II - Input array is sorted
Given an array of integers that is already sorted in ascending order,
find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target,
where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and
you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */

public class TwoSumII {
    public int[] twoSumII(int[] nums, int target){
        if(nums.length == 0 || nums == null){
            return null;
        }
        int a_pointer = 0;
        int b_pointer = nums.length-1;
        for(int i = 0; i<nums.length; i++){
            int sum = nums[a_pointer]+ nums[b_pointer];
            if(sum>target){
                b_pointer--;
            }else if(sum<target){
                a_pointer++;
            }else{
                return new int[]{a_pointer+1, b_pointer+1};
            }
        }
        return new int[]{a_pointer+1,b_pointer+1};
    }
    public static void main(String[] args){
        TwoSumII obj = new TwoSumII();
        int [] numbers = {2,7,11,15};
       int[] results = obj.twoSumII(numbers, 9);
       for(int i = 0; i<results.length-1; i++){
           System.out.print("["+results[i]+","+results[i+1]+"]");
       }
    }
}
