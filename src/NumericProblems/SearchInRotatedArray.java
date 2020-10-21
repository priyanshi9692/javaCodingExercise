package NumericProblems;
//33. Search in Rotated Sorted Array

//Given an integer array nums sorted in ascending order, and an integer target.
//
//Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [0,1,2,4,5,6,7]
// might become [4,5,6,7,0,1,2]).
//
//You should search for target in nums and if you
// found return its index, otherwise return -1.
//
//
//
//Example 1:
//
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Example 2:
//
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
//Example 3:
//
//Input: nums = [1], target = 0
//Output: -1

public class SearchInRotatedArray {
    public int search(int[] nums, int target){
        return binarySearch(nums, 0, nums.length-1, target);
    }
    public int binarySearch(int[] nums, int left, int right, int target){
        if(left>right){
            return -1;
        }
       int mid = left + (right-left)/2;
        if(target == nums[mid]){
            return mid;
        }
        if(nums[left]<=nums[mid]){
            if(nums[left]<=target && target<nums[mid]){
                return binarySearch(nums, left, mid-1, target);
            }else{
                return binarySearch(nums, mid+1, right, target);

            }

        }
        else{
            if(nums[mid]<target && target<=nums[right]){
                return binarySearch(nums, mid+1, right, target);
            }else{
                return binarySearch(nums, left, mid-1, target);
            }
        }
    }
    public static void main(String [] args){
        SearchInRotatedArray obj = new SearchInRotatedArray();
        int [] nums ={4, 5, 6, 7, 0, 1, 2};
        System.out.println(obj.search(nums,0));
    }


}
