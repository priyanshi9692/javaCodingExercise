package NumericProblems;
/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Note:

Division between two integers should truncate toward zero.
The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.
Example 1:

Input: ["2", "1", "+", "3", "*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
 */

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evaluatingNotation(String [] tokens){
        int result = 0;
        String operators = "+-/*";
        Stack<Integer> stack = new Stack<>();
        for(String t : tokens){
            if(!operators.contains(t)){
                stack.push(Integer.valueOf(t));
            }else{
                int a = stack.pop();
                int b = stack.pop();
                switch (t){
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(b-a);
                        break;
                    case "/":
                        stack.push(b/a);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                }
            }
        }
        result = stack.pop();
        return result;

    }
    public static void main(String[] args){
        EvaluateReversePolishNotation obj = new EvaluateReversePolishNotation();
        String [] str = {"2", "1", "+", "3", "*"};
        System.out.println(obj.evaluatingNotation(str));
    }
}
