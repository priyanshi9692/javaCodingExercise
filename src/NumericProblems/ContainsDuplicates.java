package NumericProblems;
/*
217. Contains Duplicate
 */

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        if(nums== null || nums.length==0){
            return false;
        }
        HashSet<Integer> hset= new HashSet<>();
        for(int i=0; i< nums.length; i++){
            if(!hset.add(nums[i])){
                return true;
            }
        }
        return false;
}
    public boolean duplicates(int[] nums){
        if(nums == null || nums.length == 0 ){
            return false;
        }
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i]== nums[i+1]){
                return true;
            }
        }
        return false;
    }
public static void main(String [] args){
        ContainsDuplicates obj= new ContainsDuplicates();
        int [] arr= {1,1,3,4,5, 2, 4};
        System.out.println(obj.containsDuplicate(arr));
        System.out.println(obj.duplicates(arr));
}
}
