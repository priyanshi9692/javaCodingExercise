package NumericProblems;

public class RemoveDuplicates {
    public int removeDuplicates(int [] nums){
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
    public static void main(String [] args){
        RemoveDuplicates arr=new RemoveDuplicates();
        int [] nums={1,1,2,2,3,4,4,4,5,5,5};
        int n= arr.removeDuplicates(nums);
        for(int i=0; i<n; i++){
            System.out.print(nums[i]+ " ");
        }
    }
}
