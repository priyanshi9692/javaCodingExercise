package NumericProblems;

import java.util.HashSet;
import java.util.Iterator;

public class SingleNumberInAnArray {
    public int singleNumber(int [] nums){
        if(nums==null){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i< nums.length; i++){
            if(!set.add(nums[i])){
                set.remove(nums[i]);
            }
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
    public static void main(String [] args){
        SingleNumberInAnArray obj = new SingleNumberInAnArray();
        int [] arr ={4,1,2,1,2};
        System.out.println(obj.singleNumber(arr));
    }
}
