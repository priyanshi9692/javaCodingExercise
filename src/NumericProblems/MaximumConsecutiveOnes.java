package NumericProblems;
/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
 */

public class MaximumConsecutiveOnes {
    public int findNumberOfOnes(int[] nums){
        if(nums == null ){
            return 0;
        }
        int result =0;
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=1){
                count =0;
            }if(nums[i]==1){
                count++;
                result = Math.max(result, count);
            }
        }
        return result;
    }
    public static void main(String[] args){
        MaximumConsecutiveOnes obj = new MaximumConsecutiveOnes();
        int [] arr = {1,0,1,1,0,1};
        System.out.println(obj.findNumberOfOnes(arr));
    }
}
