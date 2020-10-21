package NumericProblems;

/*
31. Next Permutation
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

The replacement must be in place and use only constant extra memory.
Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
Example 4:

Input: nums = [1]
Output: [1]

 */
public class NextPermutation {
    public void nextPermutation(int[] nums){
        int mark = -1;
        // scan from right to left, find the first element that is less than its previous one

        for(int i =nums.length-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                mark = i-1;
                break;
            }
        }
        if(mark == -1){
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int idx = nums.length-1;
        for (int i = nums.length-1; i >= mark+1; i--) {
            if (nums[i] > nums[mark]) {
                idx = i;
                break;
            }
        }
        swap(nums, mark, idx);

        reverse(nums, mark + 1, nums.length - 1);
    }
    public void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        NextPermutation obj = new NextPermutation();
        int[] arr = {1,2,3};

        obj.nextPermutation(arr);
      for(int i = 0; i<arr.length; i++){
          System.out.print(arr[i]+ "\t");
      }

    }
}
