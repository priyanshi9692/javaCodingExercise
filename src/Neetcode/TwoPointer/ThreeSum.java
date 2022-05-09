package Neetcode.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        if(nums == null || nums.length == 0){
            return null;
        }
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for(int i =0; i<nums.length; i++){
            int start = i+1;
            int end = nums.length-1;

            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            while(start<end){
                if(end<nums.length-1 && nums[end] == nums[end+1]){
                    end--;
                    continue;
                }

                if(nums[i]+nums[start]+nums[end]>0){
                    end--;
                }else if(nums[i]+nums[start]+nums[end]<0){
                    start++;
                }else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    start++;
                    end--;
                    result.add(list);
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};;

        System.out.println("Three Sum: "+ threeSum(nums));
    }
}
