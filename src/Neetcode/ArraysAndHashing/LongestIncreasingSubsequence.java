package Neetcode.ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static int longestConsecutiveSequence(int[] nums){
        List<Integer> subsequence = new ArrayList<>();
        subsequence.add(nums[0]);

        for(int i = 1; i<nums.length; i++){
            int num = nums[i];
            if(num>subsequence.get(subsequence.size()-1)){
                subsequence.add(num);
            }else{
                int indexOfConsideration = binarySearch(subsequence, num);
                subsequence.set(indexOfConsideration, num);
            }
        }
        return subsequence.size();
    }

    public static int binarySearch(List<Integer> subsequence, int target){
        int start =0;
        int end = subsequence.size()-1;

        while(start<= end){
            int mid = start+(end-start)/2;

            if(subsequence.get(mid) == target){
                return mid;
            }else if(subsequence.get(mid)>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args){
        System.out.println("Longest Increasing Subsequence: "+ longestConsecutiveSequence(new int[]{
                10,9,2,5,3,7,101,18
        }));
    }
}
