package NumericProblems;
/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
 */

public class ReverseANumber {
    public int reverseNumber(int num){
        int sum = 0;
        int rem ;
        while(num!=0){
            rem = num%10;
            num = num/10;
            if(sum>Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE/10 && rem>7)){
                return 0;
            }
            if(sum<Integer.MIN_VALUE/10 ||(sum == Integer.MIN_VALUE/10 && rem<-8)){
                return 0;
            }
            sum = sum*10+rem;
        }
        return sum;
    }
    public static void main(String[] args){
        ReverseANumber obj = new ReverseANumber();
        System.out.println(obj.reverseNumber(-321));
    }
}
