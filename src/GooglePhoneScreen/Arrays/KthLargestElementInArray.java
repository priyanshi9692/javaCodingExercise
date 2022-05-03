package GooglePhoneScreen.Arrays;

import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static int kthLargest(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num: nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args){
        int [] nums = {2,4,1,3,5,6};
        System.out.println("Kth Largest Element: "+kthLargest(nums, 3));
    }
}
