package Visa;

public class SearchInRotatedSortedArray {
    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(nums[mid]== target){
                return mid;
            }else if(nums[mid]>nums[start]){
                if(nums[start]<=target && target<nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target <= nums[end] && nums[mid]<target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println("Index: "+ binarySearch(new int[]{4,5,6,7,0,1,2}, 0));
    }
}
