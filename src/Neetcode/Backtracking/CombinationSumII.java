package Neetcode.Backtracking;

import java.util.*;

public class CombinationSumII {
    public static List<List<Integer>> combinationSumII(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0){
            return result;
        }

        Arrays.sort(nums);

        combinationRecursion(nums, 0, target ,new ArrayList<>(), result);
        return result;
    }

    public static void combinationRecursion(int[] nums, int index, int target, List<Integer> list, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(list));
        }

        if(target<0){
            return;
        }

        int prev = -1;

        for(int i = index; i<nums.length; i++){
            if(prev!= nums[i]){
                list.add(nums[i]);
                combinationRecursion(nums, i+1, target-nums[i], list, result);
                list.remove(list.size()-1);
                prev = nums[i]; // in order to maintain unique values only
            }
        }
    }
    public static void main(String[] nums){
        System.out.println("Combination Sum: "+ combinationSumII(new int[]{10,1,2,7,6,1,5}, 8));
    }
}
