package NumericProblems;

import java.util.Arrays;
import java.util.HashMap;

public class NonRepeatingElement {
    public int nonRepeat(int [] arr){

        for(int i =0; i<arr.length; i++){
            int j;
            for(j =0; j<arr.length; j++){
                if(i!=j && arr[i] == arr[j]){
                    break;
                }
            }
            if(j == arr.length){
                return arr[i];
            }

        }
        return -1;
    }
    public int nonRepeatingElement(int[] arr){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i], hmap.get(arr[i])+1);
            }else{
                hmap.put(arr[i],1);
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(hmap.get(arr[i])==1){
                return arr[i];
            }
        }
        return -1;
    }

    public int[] twoSum(int [] arr, int target){

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            if(hmap.containsKey(arr[i])){
                return new int[]{hmap.get(arr[i]), i};
            }else{
                hmap.put(target-arr[i], i);
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args){
        NonRepeatingElement obj = new NonRepeatingElement();
        int [] arr = {-1, 2 ,-1 ,3 ,2};
        System.out.println(obj.nonRepeatingElement(arr));
        System.out.println(obj.twoSum(arr,4));

    }
}
