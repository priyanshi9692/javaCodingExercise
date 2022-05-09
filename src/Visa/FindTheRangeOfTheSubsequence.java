package Visa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindTheRangeOfTheSubsequence {
    public static int[] rangeOfMaximumAndMinimum(List<Integer> list){
        int[] result= new int[2];

        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int num: list){
            map.put(num, false);
        }

        int longestStreak = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        for(int num: list){
            int count = 0;
            while(map.containsKey(left)){
                map.put(left, true);
                left--;
                count++;
            }

            while(map.containsKey(right)){
                map.put(right, true);
               right++;
                count++;
            }

           if(longestStreak<count){
               longestStreak = count;
               result[0] = left+1;
               result[1] = right-1;
           }
        }
        return result;
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(24,26,25,1,4,2,3,0,5,6,7));
        System.out.println("Range: "+ Arrays.toString(rangeOfMaximumAndMinimum(list)));
    }
}
