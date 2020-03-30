package NumericProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class CerealSegment {

        public int segment(int x, List<Integer> arr) {
            // Write your code here
            List<List<Integer>> lists = new ArrayList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int j=x-1;
            for(int i=0; i<arr.size();i++){

                j=i+x-1;
                if(j == arr.size()){
                    break;
                }
                pq.add(minOfsubArray(i,j,arr));
            }
            int pqLength = pq.size();
            for(int z=0;z<pqLength-1;z++){
                pq.poll();
            }
            return pq.poll();
        }
        public int minOfsubArray(int i,int j, List<Integer> arr) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int x=i;x<=j;x++){
                pq.offer(arr.get(x));
            }
            return pq.poll();
        }
        public int cerealSegment(int x, List<Integer> arr) {
            // Write your code here
            int max = Integer.MIN_VALUE;
            int j=x-1;
            for(int i=0; i<arr.size();i++){
                j=i+x-1;
                if(j == arr.size()){
                    break;
                }

                max = Math.max(minOfArray(i,j,arr),max);
            }
            return max;
        }
        public int minOfArray(int i,int j, List<Integer> arr) {
            int min = Integer.MAX_VALUE;
            for(int x=i;x<=j;x++){
                min = Math.min(arr.get(x),min);
            }
            return min;
        }

}
