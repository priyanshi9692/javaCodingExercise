package NumericProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1200. Minimum Absolute Difference
Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference
of any two elements.

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr

Example 1:

Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

 */
public class MinimumAbsoluteDiff {
    public List<List<Integer>> minimumDiff(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MIN_VALUE;
        for(int i =0; i<arr.length-1; i++){
            List<Integer> list = new ArrayList<>();
            int diff = arr[i+1]-arr[i];
            if(minDiff>diff){
                minDiff=diff;
                result.clear();
                list.add(arr[i]);
                list.add(arr[i+1]);
                result.add(list);
            }else if(minDiff == diff){
                list.add(arr[i]);
                list.add(arr[i+1]);
                result.add(list);
            }
        }
        return result;
    }
}
