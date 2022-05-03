package MicrosoftOA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Write a function that, given an array A of N integers,
returns the lagest integer K > 0 such that both values K and -K exist in array A.
If there is no such integer, the function should return 0.

Example 1:

Input: [3, 2, -2, 5, -3]
Output: 3
Example 2:

Input: [1, 2, 3, -4]
Output: 0
 */
public class LargestKFinding {
    public static int findLargestK(int[] nums){
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            set.add(-nums[i]);
            if(set.contains(nums[i])) {
                res = Math.max(res, Math.abs(nums[i]));
            }
        }
        return res;
    }
    public static int findLargestSorting(int[] nums){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int result = 0;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum == 0){
                result = Math.max(result, nums[right]);
                right--;
                left++;
            }else if(sum<0){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args){
       int[] nums = {2,-4,3, -3,5};
       System.out.println("Largest Number: "+ findLargestK(nums));
        System.out.println("Largest Number: "+ findLargestSorting(nums));
    }
}
