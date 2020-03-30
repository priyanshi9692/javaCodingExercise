package StringProblems;

import java.util.*;

public class RemoveConsecutiveRepeatElements {
    public void removeConsec(String a){
        if(a.length()==1 || a==null){
            return;
        }
        char [] arr=a.toCharArray();
        Stack<Character> stack =new Stack<>();
        for(int i=0; i<a.length(); i++){
            if(!stack.isEmpty() && stack.peek()==arr[i]){
                stack.pop();
            }
            else {
                stack.push(arr[i]);
            }
        }
        int len = stack.size();
        ArrayList<Character> al = new ArrayList<>();
        for(int i=0; i<len; i++){
           al.add(stack.pop());
        }
        Collections.reverse(al);
        for(int j=0;j<al.size();j++){
            System.out.print(al.get(j));
        }


    }
    public static void main(String [] args){
        RemoveConsecutiveRepeatElements obj =new RemoveConsecutiveRepeatElements();
        obj.removeConsec("abbcdddfghhg");
    }
}
