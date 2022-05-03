package NumericProblems;
/*
80. Remove Duplicates from Sorted Array II
Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

Clarification:

Confused why the returned value is an integer, but your answer is an array?

Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}

Example 1:

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3]
Explanation: Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3
respectively. It doesn't matter what you leave beyond the returned length.
 */
public class RemoveDuplicatedII {
    public static int removeDuplicatesII(int [] nums){
        if(nums == null ){
            return 0;
        }
        if(nums.length<=2){
            return nums.length;
        }
        int i = 1;
        int j = 2;
        while(j<nums.length){
            if(nums[j] ==  nums[i] && nums[j] ==nums[i-1]){
                j++;
            }else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }

        return i+1;
    }
    public static void main(String[] args){
        int [] nums = {0,0,1,1,1,1,2,3,3};

        System.out.println(removeDuplicatesII(nums));
    }
}
