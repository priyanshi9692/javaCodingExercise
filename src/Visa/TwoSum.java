package Visa;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        if(nums == null || nums.length == 0){
            return new int[]{-1,-1};
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }else{
                map.put(target-nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int[]nums = {2,7,11,15};

        System.out.println("Two Sum: "+ Arrays.toString(twoSum(nums, 9)));
    }
}
