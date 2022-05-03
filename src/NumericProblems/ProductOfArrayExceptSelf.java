package NumericProblems;
/*
238. Product of Array Except Self
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the
product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
 */

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums){
        int[] result = new int[nums.length];
        result[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--){
            result[i] = result[i+1]*nums[i+1];
        }

        int left=1;
        for(int i=0; i<nums.length; i++){
            result[i] = result[i]*left;
            left = left*nums[i];
        }

        return result;
    }
    public static void main(String[] args){
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        int[] nums = {1,2,3,4};
        int [] result = obj.productExceptSelf(nums);
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]+",");
        }

    }
}
