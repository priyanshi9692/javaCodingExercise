package SlidingWindowProblem;

import java.util.ArrayList;

public class SlidingWindowProblem {
    public ArrayList<Integer> maxValue(ArrayList<Integer> a, int k){
        int start=0;
        int end= k-1;
        Integer[] array = new Integer[a.size()];
        ArrayList<Integer> arr= new ArrayList<>();
        array = a.toArray(array);
        while(end<=a.size()-1){
            int maxValue=Integer.MIN_VALUE;
            for(int i=start; i<=end; i++){
                if(array[i]> maxValue)
                {
                    maxValue=array[i];
                }
            }
            arr.add(maxValue);
            start++;
            end++;
        }
        return arr;
    }
    public ArrayList<Integer> sumValue(ArrayList<Integer> a, int k){
        int start=0;
        int end= k-1;
        Integer[] array = new Integer[a.size()];
        ArrayList<Integer> arr= new ArrayList<>();
        array = a.toArray(array);
        while(end<=a.size()-1){
            int sum=0;
            for(int i=start; i<=end; i++){
                sum+=array[i];
            }
            arr.add(sum);
            start++;
            end++;
        }
        return arr;
    }
    public static void main(String[] args){
        SlidingWindowProblem max= new SlidingWindowProblem();
        SlidingWindowProblem sum= new SlidingWindowProblem();
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(-3);
        arr.add(3);
        arr.add(5);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        System.out.println(max.maxValue(arr, 3));
        System.out.println(sum.sumValue(arr, 3));
    }

}
//Time Complexity: O(n*k) and Space Complexity: O(n-k+1)