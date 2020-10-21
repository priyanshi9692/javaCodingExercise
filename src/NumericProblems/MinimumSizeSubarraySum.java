package NumericProblems;
/*
Given an array of n positive integers and a positive integer s,
find the minimal length of a contiguous subarray of which the sum ≥ s.
If there isn't one, return 0 instead.

Example:

Input: s = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: the subarray [4,3] has the minimal length under the problem constraint.
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums){
        if(nums== null || nums.length==0 ){
            return 0;
        }
        int i=0;
        int j=0;
        int sum =0;
        int minLen = Integer.MAX_VALUE;
        while(j<nums.length){
            if(sum<s) {
                sum = sum+nums[j];
                j++;
            }else{
                minLen = Math.min(minLen, j-i);
                if(i ==  j-1){
                    return 1;
                }
                sum = sum-nums[i];
                i++;
            }
        }
        while(sum>=s){
            minLen = Math.min(minLen, j-i);
            sum = sum-nums[i++];
        }
        return minLen == Integer.MAX_VALUE? 0: minLen;
    }
    public static void main(String [] args){
        MinimumSizeSubarraySum obj = new MinimumSizeSubarraySum();
        int [] arr = {2,3,1,2,4,3};
        int sum = 7;
        System.out.println(obj.minSubArrayLen(sum, arr));
    }
}
