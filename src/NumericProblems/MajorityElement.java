package NumericProblems;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int [] nums){
        if(nums==null){
            return 0;
        }
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hmap.containsKey(nums[i])){
                int count = hmap.get(nums[i])+1;
                if(count>nums.length/2){
                    return nums[i];
                }else{
                    hmap.put(nums[i], count);
                }
            }
            else{
                hmap.put(nums[i], 1);
            }
        }
        return 0;
    }
    public static void main(String [] args){
        MajorityElement obj = new MajorityElement();
        int [] nums={1,2,2,1,2,2};
        System.out.println(obj.majorityElement(nums));

    }
}
