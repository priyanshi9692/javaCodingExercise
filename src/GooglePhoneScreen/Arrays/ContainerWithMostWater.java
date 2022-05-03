package GooglePhoneScreen.Arrays;

public class ContainerWithMostWater {
    public static int containerWithMostWater(int[] heights){
        int left = 0;
        int right = heights.length-1;
        int ans = 0;
        while(left<right){
            ans = Math.max(ans, Math.min(heights[left], heights[right])*(right-left));
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }

    public static void main (String[] args){
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println("Container with most water: "+ containerWithMostWater(heights));
    }
}
