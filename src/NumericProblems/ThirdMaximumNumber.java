package NumericProblems;
/*
Given a non-empty array of integers, return the third maximum number in this array.
If it does not exist, return the maximum number. The time complexity must be in O(n).
 */

public class ThirdMaximumNumber {
    public int thirdMaximumNumber(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int index =0;
        Long [] result ={Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for(int i=0 ; i< nums.length; i++){
            if(nums[i] > result[0]){
                result[2]=result[1];
                result[1]=result[0];
                result[0] = Long.valueOf(nums[i]);
                index ++;
            }else if(nums[i]> result[1] && nums[i]<result[0]){
                result[2]= result[1];
                result[1]= Long.valueOf(nums[i]);
                index++;
            }else if(nums[i]>result[2] && nums[i]<result[1]){
               result[2]= Long.valueOf(nums[i]);
               index++;
            }
        }
        return index>2 ? result[2].intValue() : result[0].intValue();
    }
    public static void main(String[] args){
        ThirdMaximumNumber obj = new ThirdMaximumNumber();
        int [] arr ={2,1};
        System.out.println(obj.thirdMaximumNumber(arr));
    }
}
