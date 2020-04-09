package NumericProblems;

public class DivideNumbers {
    public int divide(int dividend, int divisor){
        int sign = (dividend < 0)^(divisor < 0) ? -1 : 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient =0;
        while(dividend>=divisor){
            dividend = dividend - divisor;
            ++quotient;
        }
        return sign*quotient;
    }
    public static void main(String [] args){
        DivideNumbers obj = new DivideNumbers();
        System.out.println(obj.divide(9,6));
    }
}
