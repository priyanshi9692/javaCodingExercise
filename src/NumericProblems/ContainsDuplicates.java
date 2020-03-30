package NumericProblems;

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
public static void main(String [] args){
        ContainsDuplicates obj= new ContainsDuplicates();
        int [] arr= {1,2,3,4,5};
        System.out.println(obj.containsDuplicate(arr));
}
}
