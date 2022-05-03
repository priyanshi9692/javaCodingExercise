package Neetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();

        permutations(nums, 0, result);

        return result;
    }

    public static void permutations(int[] nums, int index, List<List<Integer>> result){
        if(index == nums.length-1){
            List<Integer> list = new ArrayList<>();
            for(int num: nums){
                list.add(num);
            }
            result.add(list);
        }

        // Action->Recursion->Backtracking
        for(int i = index; i<nums.length; i++){
            swap(nums, i, index);
            permutations(nums, index+1, result);
            swap(nums, i, index);
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        System.out.println("Permutations: "+ permute(new int[]{1,2,3}));
    }
}
