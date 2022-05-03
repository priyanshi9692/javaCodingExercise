package Neetcode.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public static List<List<Integer>> subsetII(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        subsetsII(nums, 0, list, result);

        return result;
    }

    public static void subsetsII(int[] nums, int index, List<Integer> list, List<List<Integer>>result){
        result.add(new ArrayList<>(list));

        for(int i = index; i<nums.length; i++){
            if(i>index && nums[i] == nums[i-1]){
                continue;
            }
            list.add(nums[i]);

            subsetsII(nums, i+1, list, result);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args){
        System.out.println("Subsets: "+ subsetII(new int[]{1,2,2}));
    }
}
