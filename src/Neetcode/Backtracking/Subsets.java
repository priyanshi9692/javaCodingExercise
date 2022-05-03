package Neetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(nums == null){
            return result;
        }
        recurseBacktrack(nums, 0, list, result);
        return result;
    }
    public static void recurseBacktrack(int[] nums, int start, List<Integer> list, List<List<Integer>> result){
        // Base condition-> Add even empty list
        result.add(new ArrayList<>(list));
        // action
        // recurse
        // backtrack

        for(int i = start; i<nums.length; i++){
            // action
            list.add(nums[i]);
            // recursion
            recurseBacktrack(nums, i+1, list, result);
            //backtrack
            list.remove(list.size()-1);

        }
    }
    public static void main(String[] args){
        System.out.println("Subsets: "+ subsets(new int[]{1,2,3}));
    }
}
