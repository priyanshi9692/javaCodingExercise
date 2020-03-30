package NumericProblems;
/*
Given an integer array, you need to find one continuous
sub array that if you only sort this sub array in ascending order,
then the whole array will be sorted in ascending order, too.
You need to find the shortest such sub array and output its length.
 */
public class ShortestUnsortedSubarray {
    public int findUnsortedSubarray(int [] nums){
        if(nums.length==0 || nums==null){
            return 0;
        }
      int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean flag = false;
        for(int i=1; i< nums.length; i++){
            if(nums[i]<nums[i-1]){
                flag = true;
            }
            if(flag){
                min = Math.min(min, nums[i]);
            }
        }
        for(int i= nums.length-2; i>=0; i--){
            if(nums[i]>nums[i+1]){
                flag = true;
            }
            if(flag){
                max = Math.max(max, nums[i]);
            }
        }
        int r, l;
        for(l=0 ; l< nums.length; l++){
            if(min<nums[l]){
                break;
            }
        }
        for(r= nums.length-1; r>=0; r--){
            if(max>nums[r]){
                break;
            }
        }
        return r-l <0 ?0: r-l+1;
    }
    public static void main(String[] args){
        ShortestUnsortedSubarray obj =new ShortestUnsortedSubarray();
        int [] arr = {2, 6, 4, 8, 10, 9, 15};
       System.out.println(obj.findUnsortedSubarray(arr));
    }
}
