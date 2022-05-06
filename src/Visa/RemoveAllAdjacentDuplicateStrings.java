package Visa;

import java.util.Stack;

public class RemoveAllAdjacentDuplicateStrings {
    public static String removeAllAdjacentDuplicateStrings(String s, int k){
        Stack<Integer> counts = new Stack<>();
        StringBuilder result = new StringBuilder(s);

        for(int i =0; i<result.length(); i++){
            if(i == 0 || result.charAt(i)!= result.charAt(i-1)){
                counts.push(1);
            }else{
                int increment = counts.pop()+1;
                if(increment == k){
                    result.delete(i-k+1, i+1);
                    i = i-k;
                }else{
                    counts.push(increment);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        System.out.println("Remove all adjacent duplicates: "+
                removeAllAdjacentDuplicateStrings("abcd",2));
        System.out.println("Remove all adjacent duplicates: "+
                removeAllAdjacentDuplicateStrings("deeedbbcccbdaa",3));
    }
}
