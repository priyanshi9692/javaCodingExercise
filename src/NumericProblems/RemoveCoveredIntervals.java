package NumericProblems;
/*
1288. Remove Covered Intervals
Given a list of intervals, remove all intervals that are covered by another interval in the list.

Interval [a,b) is covered by interval [c,d) if and only if c <= a and b <= d.

After doing so, return the number of remaining intervals.

Example 1:

Input: intervals = [[1,4],[3,6],[2,8]]
Output: 2
Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.

 */

public class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals){
        int result =0;
        for(int i =0; i<intervals.length; i++){
            if(intervals[i]!=null){
                for(int j =0; j<intervals.length; j++){
                    if(i!=j && intervals[j]!=null) {
                        if (intervals[j][0] <= intervals[i][0] && intervals[i][1] <= intervals[j][1]) {
                            intervals[i] = null;
                            break;
                        }
                    }
                }
            }
        }
        for(int[] interval : intervals){
            if(interval!=null){
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        RemoveCoveredIntervals obj = new RemoveCoveredIntervals();
        int [][] arr = {
                {1,4},
                {3,6},
                {2,8}
        };
        System.out.println(obj.removeCoveredIntervals(arr));
    }
}
