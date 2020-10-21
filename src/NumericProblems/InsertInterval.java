package NumericProblems;
/*
Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
Example 2:

Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 */

import com.sun.prism.shader.AlphaOne_RadialGradient_AlphaTest_Loader;

import java.util.ArrayList;


    public class InsertInterval {
        public static class Interval{
            int start;
            int end;
            Interval(){start=0; end=0;}
            Interval(int s, int e){
                start = s;
                end = e;
            }
        }
        public ArrayList<Interval> insertInterval(ArrayList<Interval> intervals, Interval newInterval){
            ArrayList<Interval> result = new ArrayList<>();

            for(Interval I: intervals){
                if(I.end < newInterval.start){
                    result.add(I);
                }else if(I.start > newInterval.end){
                    result.add(newInterval);
                    newInterval = I;
                }else if(I.end >= newInterval.start || I.start <= newInterval.end){
                    newInterval = new Interval(Math.min(I.start, newInterval.start), Math.max(I.end, newInterval.end));
                }
            }
            result.add(newInterval);
            return result;
        }
        public static void main(String[] args){
           InsertInterval obj = new InsertInterval();
           ArrayList<Interval> list = new ArrayList<>();
           list.add(new Interval(1,2));
           list.add(new Interval(3,5));
            list.add(new Interval(6,7));
            list.add(new Interval(8,10));
            list.add(new Interval(12,16));
            Interval newI = new Interval(4,8);

           ArrayList<Interval> result = obj.insertInterval(list, newI);
           for(int i =0 ; i<result.size(); i++){
               System.out.println(result.get(i));
           }

        }

    }


