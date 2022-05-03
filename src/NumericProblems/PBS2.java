package NumericProblems;

import java.util.HashMap;

public class PBS2 {
 public static int binarySearch(int[] nums, int target){
     int start = 0;
     int end = nums.length-1;
     while(start<=end){
         int mid = start+(end-start)/2;
         if(nums[mid] == target){
             return mid;
         }else if( nums[mid] > target){
             end = mid-1;
         }else{
             start= mid+1;
         }
     }
     return -1;
 }
 public static int[] twoSum(int[] nums, int target){
     if(nums == null || nums.length==0){
         return null;
     }
     HashMap<Integer, Integer> hmap = new HashMap<>();
     for(int i=0; i<nums.length; i++){
         if(hmap.containsKey(nums[i])){
             return new int[]{hmap.get(nums[i]),i};
         }else{
             hmap.put(target-nums[i], i);
         }
     }
     return null;
 }
 public static int removeDuplicate(int[] nums){
     int j =0;
     for(int i=0; i<nums.length-1; i++){
         if(nums[i]!=nums[i+1]){
             nums[j] = nums[i];
             j++;
         }
     }
     nums[j++] = nums[nums.length-1];
     return j;
 }
 public static int alphabeticSum(String[] str, String s){
     int sum = 0;
     int index =0;
     int result = 0;
     for(int i =0; i<str.length; i++){
         if(str[i]== s){
             for(int j=0; j<s.length(); j++){
                 sum+=s.charAt(j)-'a'+ 1;
             }
             index = i+1;
            break;
         }
     }
     result = index*sum;
     return result;
 }

    public static void main (String[] arg){
        int [] arr = {1,1,2,3,4};
////       int result = removeDuplicate(arr);
////       for(int i : result){
//           System.out.println(result);
////       }
        String[] str ={"sahil","shashank","sanjit","abhinav","mohit"};
     System.out.println(alphabeticSum(str,"abhinav"));

    }
}
