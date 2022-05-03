package MicrosoftOA;

import java.util.Stack;

public class BackspaceCompare {
    public static boolean backSpaceCompare(String s, String t){
        int si = s.length()-1;
        int ti = t.length()-1;
        int skipS = 0;
        int skipT = 0;
        while(si>= 0 || ti>=0){

            while(si>=0){
                if(s.charAt(si) == '#'){
                    skipS++;
                    si--;
                }else if(skipS>0){
                    skipS--;
                    si--;
                }else{
                    break;
                }
            }

            while(ti>=0){
                if(s.charAt(ti) == '#'){
                    skipT++;
                    ti--;
                }else if(skipT>0){
                    skipT--;
                    ti--;
                }else{
                    break;
                }
            }

            if((si>=0 || ti>=0) && s.charAt(si)!=t.charAt(ti)){
                return false;
            }
            if((si>=0)!=(ti>=0)){
                return false;
            }
            si--;
            ti--;
        }
        return true;
    }
    public static boolean backSpaceCompareUsingStack(String s, String t){
        return stringAfterBackSpace(s).equals(stringAfterBackSpace(t));
    }
    public static String stringAfterBackSpace(String s){
        char[] cArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c: cArr){
            if(c!='#'){
                stack.push(c);
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
    public static void main(String[] args){
        System.out.println(backSpaceCompare("ab#c", "ad#c"));
        System.out.println(backSpaceCompare("ab##", "c#d#"));
        System.out.println(backSpaceCompareUsingStack("ab##", "c#d#"));
    }
}
