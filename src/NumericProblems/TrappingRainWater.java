package NumericProblems;
/*
42. Trapping Rain Water

Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
In this case, 6 units of rain water (blue section) are being trapped.
 */

public class TrappingRainWater {
    public int trappingRainWater(int[] heights){
        int result = 0;
        if(heights == null || heights.length<2){
            return result;
        }
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        int max = heights[0];
        left[0] = heights[0];
        for(int i =1; i<heights.length; i++){
            if(heights[i]<max){
                left[i] = max;
            }else{
                left[i] = heights[i];
                max = heights[i];
            }
        }
        max = heights[heights.length-1];
        right[heights.length-1] = heights[heights.length-1];
        for(int i = heights.length-2; i>=0; i--){
            if(heights[i]<max){
                right[i] = max;
            }else{
                right[i] = heights[i];
                max = heights[i];
            }
        }

        for(int i = 0; i<heights.length; i++){
            result+= Math.min(left[i], right[i])-heights[i];
        }
        return result;
    }
    public static void main(String[] args){
        TrappingRainWater obj = new TrappingRainWater();
        int [] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(obj.trappingRainWater(nums));
    }
}
