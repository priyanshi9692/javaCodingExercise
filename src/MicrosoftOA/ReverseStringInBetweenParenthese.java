package MicrosoftOA;

import java.util.Stack;

/*
You are given a string s that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should not contain any brackets.



Example 1:

Input: s = "(abcd)"
Output: "dcba"
Example 2:

Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.
Example 3:

Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.
 */
public class ReverseStringInBetweenParenthese {
    public static String reverseString(char[] cArr, int start, int end){
        while(start<=end){
            char temp = cArr[start];
            cArr[start] = cArr[end];
            cArr[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(cArr);
    }
    public static String reverseStringInBetween(String s){
        char[] cArr = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<cArr.length; i++){
            char c = cArr[i];

            if(c == '('){
                stack.push(i);
            }else if(c == ')'){
                reverseString(cArr, stack.pop(), i);
            }else {
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c: cArr){
            if(c!='(' && c!=')'){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(reverseStringInBetween("(at (perfect))"));
    }
}
