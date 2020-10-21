package StringProblems;

public class RotateArray {
    public void rotateArray(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void rotateArrayLeft(int[] nums, int k){
        k%=nums.length;
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }

    public void reverse(int [] nums, int start, int end)
    {
        if(nums.length==0){
            return ;
        }
        while(start<end){
            int temp;
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        RotateArray arr= new RotateArray();
        int a[]={1,2,3,4,5,6,7};

//        arr.rotateArray(a, 3);
////       for(int i=0; i<a.length; i++){
////           System.out.print(a[i]+ " \t");
////
////       }
//        System.out.print("\n");

        arr.rotateArrayLeft(a, 3);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " \t");
        }
    }
}
//Time Complexity: O(n) and Space Complexity: O(1)