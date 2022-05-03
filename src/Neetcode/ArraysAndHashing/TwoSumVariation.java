package Neetcode.ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSumVariation {
    public static List<List<Integer>> twoSumVariation(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0){
            return result;
        }
        if(nums.length == 1){
            List<Integer> list = new ArrayList<>();
            list.add(nums[0]);
            result.add(list);
            return result;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int target = nums[0];
        for(int i = 1; i<nums.length; i++){
            List<Integer> list = new ArrayList<>();
            if(map.containsKey(nums[i])){
                int pairValue = map.get(nums[i]);
                list.add(pairValue);
                list.add(nums[i]);
                result.add(list);
            }else{
                map.put(target-nums[i], nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println("Pairs sum up to target: "+ twoSumVariation(new int[]{7,3,5,2,-4,11, 1}));
    }
}
