package Java8Features;

import java.util.Random;

public class LambdaExpressions {
    interface MathOperation{
        int operation(int a, int b);

    }
    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }

    public static void main(String[] args){
        LambdaExpressions obj = new LambdaExpressions();

        MathOperation add = (p1,p2) -> p1+p2;
        MathOperation sub = (p1,p2) -> p1-p2;
        MathOperation multi = (p1,p2)-> p1*p2;
        MathOperation div = (p1,p2) -> p1/p2;

        System.out.println("Addition of two number: "+ obj.operate(10,5, add));
        System.out.println("Subtraction of two number: "+ obj.operate(10,5, sub));
        System.out.println("Multiplication of two number: "+ obj.operate(10,5, multi));
        System.out.println("Divison of two number: "+ obj.operate(10,5, div));
        Random random = new Random();
        random.ints().limit(5).forEach((c)->System.out.print(c + "\t"));
    }
}
