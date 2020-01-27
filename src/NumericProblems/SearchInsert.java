package NumericProblems;

public class SearchInsert {
    public int searchInsertPosition(int [] nums, int target){
        int start=0;
        int end= nums.length-1;
        while(start+1<end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid;
            }
            else{
                start=mid;
            }
        }
        if(nums[end]< target){
            return end+1;
        }
        else if(nums[start]>= target){
            return start;
        }
        else{
            return end;
        }
    }
    public static void main(String [] args){
        SearchInsert obj= new SearchInsert();
        int [] arr={1,2,3,4,5,6};
        int element=5;
        System.out.println(obj.searchInsertPosition(arr,element));
    }
}
