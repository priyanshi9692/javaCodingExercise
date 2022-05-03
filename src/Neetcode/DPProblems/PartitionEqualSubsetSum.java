package Neetcode.DPProblems;

public class PartitionEqualSubsetSum {
    public static boolean canPartition(int[] nums){
        int totalSum = 0;

        for(int num: nums){
            totalSum+= num;
        }
        if(totalSum%2!= 0){
            return false;
        }
        int subsetSum = totalSum/2;
        int n = nums.length;
        Boolean[][] memo = new Boolean[n+1][subsetSum+1];
        return canPartitionSubset(nums, n-1, subsetSum, memo);
    }
    public static boolean canPartitionSubset(int[] nums, int n, int sum, Boolean[][] memo){
        if(sum == 0){
            return true;
        }

        if(n == 0 || sum<0){
            return false;
        }

        if(memo[n][sum]!= null){
            return memo[n][sum];
        }
        boolean result = canPartitionSubset(nums,n-1, sum-nums[n-1], memo)
                || canPartitionSubset(nums, n-1, sum, memo);

        memo[n][sum]= result;
        return result;
    }
    public static void main(String[] args){
        System.out.println("Partition possible: "+canPartition(new int[]{1,5,11,5}));
        System.out.println("Partition possible: "+canPartition(new int[]{1,2,3,5}));
    }
}
