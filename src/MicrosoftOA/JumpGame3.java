package MicrosoftOA;

import java.util.HashSet;

public class JumpGame3 {
    public static boolean canReach(int[] arr, int start){
        return canReachZero(arr, start, new HashSet<>());
    }
    public static boolean canReachZero(int[]arr, int start, HashSet<Integer>set){
        if(start>=0 && start<arr.length && arr[start]>=0){
            if(arr[start] == 0){
                return true;
            }
            if(set.contains(start)){
                return false;
            }
            set.add(start);
            return canReachZero(arr, start+arr[start], set) || canReachZero(arr, start-arr[start], set);
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {4,2,3,0,3,1,2};
        System.out.println(canReach(arr, 5));
    }
}
