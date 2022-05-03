package GooglePhoneScreen.Trees;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s){
        StringBuilder result = new StringBuilder();
        Stack<Integer> count = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        int k = 0;
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                k = k*10+ c-'0';
            }else if(c == '['){
                count.push(k);
                stringStack.push(result);
                k = 0;
                result = new StringBuilder();
            }else if(c == ']'){
                StringBuilder transform = stringStack.pop();
                int repetation = count.pop();

                while(repetation>0){
                    transform.append(result);
                    repetation--;
                }
                result = transform;
            }else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        String s = "3[a]2[bc]";
        String s1 = "3[a2[c]]";
        String s2 = "2[abc]3[cd]ef";
        System.out.println(decodeString(s));
        System.out.println(decodeString(s1));
        System.out.println(decodeString(s2));
    }
}
