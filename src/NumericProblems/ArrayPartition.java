package NumericProblems;
/*
Given an array of 2n integers,
your task is to group these integers into n pairs of integer,
say (a1, b1), (a2, b2), ..., (an, bn)
which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 */

import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int [] nums){
        if(nums.length%2!=0 || nums == null){
            return 0;
        }
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i<nums.length-1 ; i+=2){
            sum = sum + Math.min(nums[i], nums[i+1]);
        }
        return sum;
    }
    public static void main(String[] args){
        ArrayPartition obj = new ArrayPartition();
        int [] arr={6,2,6,5,1,2};
        System.out.println(obj.arrayPairSum(arr));
    }
}
