package Neetcode.DPProblems;
/*
Time Complexity: O(N), two pass solution
Space Complexity: O(1), constant space

Approach:
1. Left to right product and then vice versa

 */
public class SubarrayMaximumProduct {
    public static int maximumSubArrayProduct(int[] nums){
        int max = Integer.MIN_VALUE;

        int product = 1;

        // left to right iteration
        for(int num: nums){
            product = num*product;
            max = Math.max(max, product);
            if(product == 0){
                product = 1;
            }
        }
        product = 1;
        // right to left iteration
        for(int i = nums.length-1; i>=0; i--){
            product = product*nums[i];
            max = Math.max(max, product);
            if(product == 0) {
                product = 1;
            }
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println("Maximum Product Subarray: "+ maximumSubArrayProduct(new int[]{2,3,-2,4}));
        System.out.println("Maximum Product Subarray: "+ maximumSubArrayProduct(new int[]{-2,0,-1}));
    }
}
