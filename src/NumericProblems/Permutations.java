package NumericProblems;
/*
Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        permutation(0, nums, result);
        return result;
    }
    public void permutation(int start, int [] nums, List<List<Integer>> result){
        if(start == nums.length-1){
            List<Integer> list = new ArrayList<>();
            for(int num: nums){
                list.add(num);
            }
            result.add(list);
            return ;
        }
        for(int i = start; i< nums.length; i++){
            swap(nums, i, start);
            permutation(start+1, nums, result);
            swap(nums, i, start);
        }

    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main (String[] args){
        Permutations obj = new Permutations();
        int [] arr = {1,2,3,4};
        System.out.println(obj.permute(arr));
    }
}
