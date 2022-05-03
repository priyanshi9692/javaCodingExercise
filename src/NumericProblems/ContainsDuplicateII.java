package NumericProblems;

import java.util.HashSet;
// Given an array of integers and an integer k,
// find out whether there are two distinct indices i and j in the array
// such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
public class ContainsDuplicateII {
    public boolean containsDuplicate(int[] nums, int k) {
        if(nums==null || nums.length<2 || k==0){
            return false;
        }
        int i=0;

        HashSet<Integer> hset = new HashSet<>();

        for(int j=0; j<nums.length; j++){
            if(!hset.add(nums[j])){
                return true;
            }

            if(hset.size()>=k+1){
                hset.remove(nums[i]);
                i++;
            }
        }

        return false;
    }
    public static void main(String[] args){
        ContainsDuplicateII obj = new ContainsDuplicateII();
        int [] arr = {1,2,3,1};
        int k=3;
        System.out.println(obj.containsDuplicate(arr,k));
    }

}
