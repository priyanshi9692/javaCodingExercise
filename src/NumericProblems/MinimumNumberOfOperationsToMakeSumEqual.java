package NumericProblems;

import java.util.Collections;
import java.util.PriorityQueue;

/*
You are given two arrays of integers nums1 and nums2, possibly of different lengths.
The values in the arrays are between 1 and 6, inclusive.

In one operation, you can change any integer's value in any of the arrays to any value between 1 and 6,
inclusive.

Return the minimum number of operations required to make the sum of values in nums1 equal
to the sum of values in nums2. Return -1
if it is not possible to make the sum of the two arrays equal.
 */

/*
Input: nums1 = [1,2,3,4,5,6], nums2 = [1,1,2,2,2,2]
Output: 3
Explanation: You can make the sums of nums1 and nums2 equal with 3 operations. All indices are 0-indexed.
- Change nums2[0] to 6. nums1 = [1,2,3,4,5,6], nums2 = [6,1,2,2,2,2].
- Change nums1[5] to 1. nums1 = [1,2,3,4,5,1], nums2 = [6,1,2,2,2,2].
- Change nums1[2] to 2. nums1 = [1,2,2,4,5,1], nums2 = [6,1,2,2,2,2].
 */
public class MinimumNumberOfOperationsToMakeSumEqual {
    public static int minOperations(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length*6 || nums2.length > nums1.length*6){
            return -1;
        }
        int sum1 = 0;
        int sum2 = 0;

        for(int i: nums1){
            sum1+= i;
        }
        for(int i: nums2){
            sum2+= i;
        }

        if(sum1> sum2){
            int[] temp= nums1;
            nums1 = nums2;
            nums2 = temp;

            int tempSum = sum1;
            sum1 = sum2;
            sum2 = tempSum;
        }

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        for(int i: nums1){
            pq1.add(i);
        }

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: nums2){
            pq2.add(i);
        }
        int numberOfOperations = 0;
        while(sum1<sum2){
            numberOfOperations++;
            if(pq2.isEmpty() || pq2.peek()-1 < 6-pq1.peek()){
                sum1+= 6-pq1.poll();
            }else{
                sum2-= pq2.poll()-1;
            }
        }
        return numberOfOperations;


    }
    public static void main(String[] args){
        int[] num = {1,2,3,4,5,6};
        int [] arr = {1,1,2,2,2,2};

        System.out.println(minOperations(num, arr));
    }
}
