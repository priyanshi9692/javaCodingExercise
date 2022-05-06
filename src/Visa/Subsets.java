package Visa;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();

        subsetsRecursion(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public static void subsetsRecursion(int[] nums, int index, List<Integer> list, List<List<Integer>> result){
        result.add(new ArrayList<>(list));

        for(int i = index; i<nums.length; i++) {
            list.add(nums[i]);
            subsetsRecursion(nums, i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args){
        System.out.println("Subsets: "+ subsets(new int[]{1,2,3}));
    }
}
