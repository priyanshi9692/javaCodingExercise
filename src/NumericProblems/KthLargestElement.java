package NumericProblems;

import java.util.PriorityQueue;

/*
Find the kth largest element in an unsorted array.
Note that it is the kth largest element in the sorted order,
not the kth distinct element.

Example 1:

Input: [3,2,1,5,6,4] and k = 2
Output: 5
Example 2:

Input: [3,2,3,1,2,4,5,5,6] and k = 4
Output: 4
 */
public class KthLargestElement {
    public int kthLargestElement(int[] nums, int k){
        if(nums==null || nums.length==0){
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i= 0; i<nums.length; i++){
            pq.add(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args){
        KthLargestElement obj = new KthLargestElement();
        int [] arr = {3,2,1,5,6,4};
        System.out.println(obj.kthLargestElement(arr, 2));
    }
}
