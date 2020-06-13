package NumericProblems;
/*
11. Container With Most Water
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49
*/

public class ContainerWithMostWater {
    public int maxArea(int[] height){
        if(height == null || height.length<2){
            return 0;
        }
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            max = Math.max(max, (right-left)*Math.min(height[left], height[right]));
            if(height[left]<height[right]){
                left ++;
            }else{
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args){
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(arr));
    }

}
