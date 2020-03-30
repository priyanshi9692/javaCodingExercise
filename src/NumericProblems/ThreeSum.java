package NumericProblems;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeSum {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> nums){
        if(nums==null || nums.size()==0){
            return null;
        }
        Collections.sort(nums);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.size(); i++){
            int start=i+1;
            int end=nums.size()-1;
            if ( i>0 && nums.get(i) == nums.get(i-1) ){
                continue;
            }
            while(start<end){
                if(end<nums.size()-1 && nums.get(end)==nums.get(end+1)  ){
                    end --;
                    continue;
                }
                if(nums.get(i)+nums.get(start)+nums.get(end)>0){
                    end --;
                }
                else if(nums.get(i)+nums.get(start)+nums.get(end)<0){
                    start ++;
                }
                else{
                    ArrayList<Integer> arr= new ArrayList<>();
                    arr.add(nums.get(i));
                    arr.add(nums.get(start));
                    arr.add(nums.get(end));
                    result.add(arr);
                    start++;
                    end--;
                }

            }
        }
        return result;
    }
    public static void main(String [] args){
        ThreeSum obj = new ThreeSum();
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(-2);
        arr.add(-1);
        arr.add(0);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        System.out.println(obj.threeSum(arr));

    }
}
