package NumericProblems;
/*
Program to find the sum of minimum absolute difference of the array is discussed here.
An array of distinct elements is given as input and the sum of
minimum absolute difference of each array element has to be found.
The minimum absolute difference is calculated using the formula,
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumDifferenceSum {
    public int minimumDifferenceSum(List<Integer> arr){
        if(arr == null || arr.size()==0){
            return 0;
        }
        int sum = 0;
        Collections.sort(arr);
        for(int i =0; i< arr.size()-1; i++){
            sum+=Math.abs(arr.get(i)-arr.get(i+1));
        }
        return sum;
    }
    public static void main(String[] args){
        MinimumDifferenceSum obj = new MinimumDifferenceSum();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        System.out.println(obj.minimumDifferenceSum(arr));
    }
}
