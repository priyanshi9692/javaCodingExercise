package NumericProblems;
/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the
relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
 */

public class MoveZeroes {
    public void moveZeroes(int[] nums){
        if(nums == null || nums.length==0){
            return;
        }
        int i=0;
        int j=0;
        while(j<nums.length) {
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        while(i<nums.length){
            nums[i++]=0;
        }
    }
    public static void main(String[] args){
        MoveZeroes obj = new MoveZeroes();
        int [] arr={5,0,1,0,3,10,0,12,0};
        obj.moveZeroes(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
