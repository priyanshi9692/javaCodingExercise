package NumericProblems;

public class RemoveElement {
    public int removeElement(int [] nums, int val){
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String [] args){
        RemoveElement obj= new RemoveElement();
        int [] arr= {1};
        int value= 5;
        int n= obj.removeElement(arr, value);
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
