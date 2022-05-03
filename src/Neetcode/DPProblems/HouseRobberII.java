package Neetcode.DPProblems;

public class HouseRobberII {
    public static int rob(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }

        return Math.max(houseRobber(nums, 0, nums.length-1), houseRobber(nums, 1, nums.length));
    }

    public static int houseRobber(int[] nums, int start, int end){
        int odd = 0;
        int even = 0;

        for(int i = start; i<end; i++){
            if(i%2 == 0){
                even+= nums[i];
                even = even>odd ? even : odd;
            }else{
                odd+= nums[i];
                odd = odd<even ? even : odd;
            }
        }
        return odd>even ? odd : even;
    }

    public static void main(String[] args){
        System.out.println("Robbery: "+ rob(new int[]{1,2,3,1}));
        System.out.println("Robbery: "+ rob(new int[]{2,3,2}));
        System.out.println("Robbery: "+ rob(new int[]{1,2,3}));
    }
}
