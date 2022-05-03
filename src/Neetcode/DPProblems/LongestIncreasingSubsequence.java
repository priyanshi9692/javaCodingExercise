package Neetcode.DPProblems;

import java.util.ArrayList;
import java.util.List;
/*
Time complexity: O(NlogN)
Space Complexity: O(N), I am using ArrayList

Approach:
1. Using binary search for finding out the next nearest increased element
 */
public class LongestIncreasingSubsequence {
    public static int longestIncreasingSubsequence(int[] nums){
        List<Integer> subsequence = new ArrayList<>();
        subsequence.add(nums[0]);
        for(int i = 1; i<nums.length; i++){
            int num = nums[i];
            if(num> subsequence.get(subsequence.size()-1)){
                subsequence.add(num);
            }else{
                int indexOfNextIncreasing = binarySearch(subsequence, num);
                subsequence.set(indexOfNextIncreasing, num);
            }
        }
        return subsequence.size();
    }

    public static int binarySearch(List<Integer> subsequence, int num){
        int start = 0;
        int end = subsequence.size()-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(subsequence.get(mid) == num){
                return mid;
            }else if(subsequence.get(mid)>num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args){
        System.out.println("Longest Increasing subsequence length: "+ longestIncreasingSubsequence(new int[]{10,9,2,5,3,7,101,18}));
        System.out.println("Longest Increasing subsequence length: "+ longestIncreasingSubsequence(new int[]{0,1,0,3,2,3}));
    }
}
