package NumericProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
56. Merge Intervals
Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, (arr1, arr2)->Integer.compare(arr1[0], arr2[0]));
        List<int[]> result = new ArrayList<>() ;
        int[] current_interval = intervals[0];
        result.add(current_interval);
        for(int [] interval: intervals){
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            if(current_end>= next_begin){
                current_interval[1] = Math.max(current_end, next_end);
            }
            else{
                current_interval = interval;
                result.add(current_interval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
public static void main(String[] args){
        MergeIntervals obj = new MergeIntervals();
        int[] [] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {9,18}
        };
        int [][]result = obj.merge(intervals);
        for(int i =0; i<result.length; i++){
            System.out.print("[");
            for(int j =0; j<result[0].length; j++){
                System.out.print(result[i][j]);
                System.out.print(",");
            }

            System.out.print("]");

        }
}
}
