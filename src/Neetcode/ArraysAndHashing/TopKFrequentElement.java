package Neetcode.ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElement {
    public static int[] topKFrequentElements(int[] nums, int k){
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num: nums){
            if(freqMap.containsKey(num)){
                freqMap.put(num, freqMap.get(num)+1);
            }else{
                freqMap.put(num, 1);
            }
        }

        // I am gonna use heap in order to arrange the element based on their frequency
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1,n2)-> Integer.compare(freqMap.get(n1),freqMap.get(n2)));

        for(int num: freqMap.keySet()){
            heap.add(num);

            if(heap.size()>k){
                heap.poll();
            }
        }

        int[] topFreq = new int[k];
        for(int i = 0;  i<k; i++){
            topFreq[i] = heap.poll();
        }
        return topFreq;
    }
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        System.out.println("Top Frequent elements: "+ Arrays.toString(topKFrequentElements(nums, 2)));
    }
}
