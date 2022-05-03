package StringProblems;

import java.util.Stack;

//(ab(d){3}){2} -> abdddabddd

public class ExpandString {
    public static String expandString(String input){
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int k =0;
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                k = k*10 + c - '0';
            }
            else if(c!='(' && c!=')' && c!= '}' && c!='{'){
                temp.append(c);
            } else if (c == ')' || c == '('){

                if(temp.length()>0) {
                    //System.out.println(temp);
                    stack.push(temp);
                    temp = new StringBuilder();
                }
            }
            else if(c=='}'){
                StringBuilder decode = new StringBuilder();
                StringBuilder newvalue = new StringBuilder();
                //stack.push(temp);
                decode = stack.pop();
                //System.out.println(k);
                //System.out.println(decode);
                while(k>0){
                    k--;
                    newvalue.append(decode);

                }
                k=0;

                if(!stack.isEmpty()){
                    System.out.println(newvalue);
                    result = stack.pop();
                    result.append(newvalue);
                    stack.push(result);
                }
                else {
                    //System.out.println(newvalue);
                    result.append(newvalue);
                    stack.push(result);
                }
            }
        }
        return result.toString();
    }

    public static void main(String args[]){
        System.out.println(expandString ("(ab(d){3}){2}"));
    }
}
