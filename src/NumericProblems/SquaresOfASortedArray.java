package NumericProblems;
/*
Given an array of integers A sorted in non-decreasing order,
return an array of the squares of each number,
also in sorted non-decreasing order.
 */

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int [] sortedSquares(int[] A){
        if(A == null || A.length == 0){
            return null;
        }
        int [] result = new int[A.length];
        for(int i = 0; i<A.length; i++){
            result[i] = (A[i]*A[i]);
        }
        Arrays.sort(result);
        return result;
    }
    public static void main(String[] args){
        SquaresOfASortedArray obj = new SquaresOfASortedArray();
        int [] arr = {-4,-1,0,3,10};
        int[]output = obj.sortedSquares(arr);
        for(int i = 0; i<output.length; i++){
            System.out.print(output[i] + "\t");
        }

    }
}
