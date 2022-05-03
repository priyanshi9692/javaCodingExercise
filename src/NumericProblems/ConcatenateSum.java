package NumericProblems;
/*
Given an array of non-negative integers, we need to find the sum of concatenation
of elements in the array.

For example - given [11, 22] the result should be - 6666
i.e.,
11 + 11 = 1111
11 + 22 = 1122
22 + 11 = 2211
22 + 22 = 2222

Sum of all those numbers would result in 6666
*/
public class ConcatenateSum {
    public static int concatenateSum(int[] a){
     int sum=0;
        for(int i =0; i<a.length; i++){
            String str = "";
            for(int j=0; j<a.length; j++){

                str = Integer.toString(a[i])+Integer.toString(a[j]);
                sum += Integer.parseInt(str);
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int [] a= {10,2};
        System.out.println(concatenateSum(a));
    }
}
