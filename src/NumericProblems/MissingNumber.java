package NumericProblems;
/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
find the one that is missing from the array.
 */
public class MissingNumber {
    public int missingNumber(int [] nums){
        int GaussianSum = nums.length*(nums.length+1)/2;
        int actualSum=0;
        for(int  num: nums){
           actualSum += num;
        }
        return GaussianSum-actualSum;
    }
    public static void main(String[] args){
        MissingNumber obj = new MissingNumber();
        int [] arr = {3,0,1,4,7,8,6,2};
        System.out.println(obj.missingNumber(arr));
    }
}
