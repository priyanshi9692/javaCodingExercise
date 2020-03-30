package NumericProblems;
/*
We define a harmounious array as an array where the difference between
its maximum value and its minimum value is exactly 1.

Now, given an integer array, you need to find the length of its longest harmonious subsequence
among all its possible subsequences.
 */

import java.util.HashMap;

public class LongestHarmonicSubsequent {
    public int longestHarmonicSubsequent(int [] nums){
        if(nums== null || nums.length==0){
            return 0;
        }
        int res=0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int num : nums){
           hmap.put(num, hmap.getOrDefault(num, 0)+1);
           if(hmap.containsKey(num+1)){
               res = Math.max(res, hmap.get(num)+hmap.get(num+1));
           }
           if(hmap.containsKey(num-1)){
               res= Math.max(res, hmap.get(num)+hmap.get(num-1));
           }

        }
        return res;
    }
    public static void main(String [] args){
        LongestHarmonicSubsequent obj = new LongestHarmonicSubsequent();
        int [] arr = {1,3,2,2,5,2,3,7};
        System.out.println(obj.longestHarmonicSubsequent(arr));
    }
}
