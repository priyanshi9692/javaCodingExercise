package Neetcode.TwoPointer;

public class ContainerWithMostWater {
    public static int containerWithMostWater(int[] heights){
        int area = 0;
        int left = 0;
        int right = heights.length-1;

        while(left<=right){
            area = Math.max(area, Math.min(heights[left], heights[right])*(right-left));

            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
    public static void main(String[] args){
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum area: "+ containerWithMostWater(heights));
    }
}
