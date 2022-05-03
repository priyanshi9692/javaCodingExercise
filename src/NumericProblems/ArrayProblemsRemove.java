package NumericProblems;
/*
1) Remove Duplicates from Sorted Array I, II, Remove Element, Move Zeroes
 */
public class ArrayProblemsRemove {
    public static int removeDuplicatesFromSortedArray1(int [] nums){
        int j=0;
        if(nums.length==0 || nums.length==1){
            return nums.length;
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i];
                j++;
            }
        }
        nums[j]=nums[nums.length-1];
        return j;
    }
    public static int removeDuplicatesII(int[] nums){
        if(nums == null){
            return 0;
        }
        if(nums.length<=2){
            return nums.length;
        }
        int i = 1;
        int j =2;
        while(j<nums.length){
            if(nums[j] == nums[i] && nums[j] == nums[i-1]){
                j++;
            }else{
                i++;
                nums[i] = nums[j];
                j++;
            }

        }
        return i+1;
    }
    public static int removeParticularElement(int[] nums, int val){
        if(nums == null || nums.length ==0){
            return 0;
        }
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void moveZeroes(int[] nums){
        if(nums==null || nums.length==0){
            return;
        }
        int i = 0;
        int j = 0;
        while(j<nums.length){
            if(nums[j]!=0){
                nums[i++]=nums[j];
            }
            j++;
        }
        while(i<nums.length){
            nums[i++] = 0;
        }
    }

    public static void main(String [] args){
        int [] nums = {1,1,2,2,2,3,3};
        int [] arr = {0,1,3,0,12};
        System.out.println("Remove Duplicates from a sorted array: "+removeDuplicatesFromSortedArray1(nums));
        System.out.println("Remove Duplicates II: " + removeDuplicatesII(nums));
        System.out.println("Remove a particular element: "+removeParticularElement(nums, 3));
        moveZeroes(arr);
        System.out.println("Move Zeroes at the end of the array");
        for(int i = 0; i<arr.length; i++){

            System.out.print(arr[i]+",");
        }
    }
}
