package Neetcode.DPProblems;

public class HouseRobber {
    public static Integer[] memo;
    public static int robHouse(int[] nums){
        memo = new Integer[nums.length];
        return rob(nums,0);
    }
    public static int rob(int[] nums, int index){
        if(index>= nums.length){
            return 0;
        }

        if(memo[index]!= null){
            return memo[index];
        }

        int robbery = nums[index]+rob(nums, index+2);
        int notRob = rob(nums, index+1);

        memo[index] = Math.max(robbery, notRob);
        return memo[index];
    }

    public static void main(String[] args){
        System.out.println("House Robber: "+robHouse(new int[]{1,2,3,1}));
    }
}
