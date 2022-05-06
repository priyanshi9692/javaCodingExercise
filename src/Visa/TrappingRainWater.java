package Visa;

public class TrappingRainWater {
    public static int trappingWater(int[] heights){
        int left = 0;
        int right = heights.length-1;
        int leftMax = 0;
        int rightMax = 0;

        int trap = 0;

        while(left<=right){
            if(heights[left]>leftMax){
                leftMax = heights[left];
            }
            if(heights[right]>rightMax){
                rightMax = heights[right];
            }

            if(leftMax<rightMax){
                trap+= Math.max(0, leftMax-heights[left]);
                left++;
            }else{
                trap+= Math.max(0, rightMax-heights[right]);
                right--;
            }
        }
        return trap;
    }

    public static void main(String[] args){
        System.out.println("Trapping rain water: "+ trappingWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
