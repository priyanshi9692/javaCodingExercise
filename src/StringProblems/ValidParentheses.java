package StringProblems;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean validP(String s){
        if(s.length()==0){
            return true;
        }
        char [] c = s.toCharArray();
        HashMap<Character, Character> hmap = new HashMap<>();
        hmap.put('(',')');
        hmap.put('{','}');
        hmap.put('[',']');
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(hmap.containsValue(c[i]) && !stack.isEmpty() && hmap.get(stack.peek())==c[i]){
                stack.pop();
            }
            else if(hmap.containsKey(c[i])){
                stack.push(c[i]);
            }
            else{
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String [] args){
        ValidParentheses obj = new ValidParentheses();
        System.out.println(obj.validP("[({("));
    }
}
