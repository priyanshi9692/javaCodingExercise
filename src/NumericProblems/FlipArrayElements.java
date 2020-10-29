package NumericProblems;
/*
Flip binary array elements to make it alternative array
 */

public class FlipArrayElements {
    public int flips(int[] nums){
        int result = 0;
       for(int i=0; i<nums.length; i++){
           if(i%2==0 && nums[i]==1){
               result++;
           }
           if(i%2==1 && nums[i] == 0){
               result++;
           }
       }
       return Math.min(result, nums.length-result);
    }
    public static void main(String[] args){
        FlipArrayElements obj = new FlipArrayElements();
        int [] nums= {1,1,1,0,1};
        System.out.println(obj.flips(nums));
    }
}
