package NumericProblems;

import java.util.Arrays;

/*
532. K-diff Pairs in an Array
Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i, j < nums.length
i != j
|nums[i] - nums[j]| == k
Notice that |val| denotes the absolute value of val.



Example 1:

Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

 */
public class KDiffPairs {
    public int diff(int[] nums, int k){
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j = i+1; j<nums.length; j++){
                int diff = Math.abs(nums[i]-nums[j]);
                if(diff== k ){
                    count++;
                }if(diff>=k){
                    break;
                }
            }
        }
        return count;
    }
public static void main(String[] args){
        KDiffPairs obj = new KDiffPairs();
        int [] nums = {3,1,2,4,5};
        System.out.println(obj.diff(nums, 2));
}
}
