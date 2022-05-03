package Neetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        combinations(nums, target, 0, list, result);
        return result;
    }
    public static void combinations(int[] nums, int target, int start, List<Integer> list, List<List<Integer>> result){
        // Base condition
        if(target<0 || nums.length == start){
            return;
        }

        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }

        // Choose Condition
        list.add(nums[start]);

        // recursion
        combinations(nums, target-nums[start], start, list, result );

        // backtrack
        list.remove(list.size()-1);

        // not choose case
        combinations(nums, target, start+1, list, result);
    }

    public static void main(String[] args){
        System.out.println("Combination Sum: "+ combinationSum(new int[]{2,3,6,7}, 7));
    }
}
