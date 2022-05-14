package Facebook.Arrays;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class KFrequentElements {
    public static int[] topKFrequentElements(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2)-> map.get(n1)-map.get(n2));

        for(int num: map.keySet()){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int[] result = new int[k];
        for(int i = 0; i<k; i++){
            result[i] = pq.poll();
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("K Frequent Elements:"+ Arrays.toString(topKFrequentElements(new int[]{1,1,1,2,2,3}, 2)));
    }
}
