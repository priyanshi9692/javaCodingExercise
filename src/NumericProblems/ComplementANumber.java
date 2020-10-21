package NumericProblems;
/*
Given a positive integer num, output its complement number.
The complement strategy is to flip the bits of its binary representation.



Example 1:

Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits),
and its complement is 010. So you need to output 2.
 */

public class ComplementANumber {
    public int findComplement(int num){
        return (1-num%2)+2*(num<=1 ? 0: findComplement(num/2));
    }
    public static void main(String[] args){
        ComplementANumber obj = new ComplementANumber();
        System.out.println(obj.findComplement(5));
    }
}
