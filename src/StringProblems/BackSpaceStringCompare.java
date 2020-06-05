package StringProblems;
/*
844. Backspace String Compare
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
 */

public class BackSpaceStringCompare {
    public boolean stringCompare(String s, String t){
        int sp = s.length()-1;
        int tp = t.length()-1;
        int s_skips = 0;
        int t_skips = 0;
        while(sp>=0 || tp>=0){
            while(sp>=0){
                if(s.charAt(sp) == '#'){
                    s_skips++;
                    sp--;
                }else if(s_skips>0){
                    s_skips--;
                    sp--;
                }else{
                    break;
                }
            }
            while(tp>=0){
                if(t.charAt(tp) == '#'){
                    t_skips++;
                    tp--;
                }else if(t_skips>0){
                    t_skips--;
                    tp--;
                }else{
                    break;
                }
            }
            if(sp>=0 && tp>=0 && (s.charAt(sp)!=t.charAt(tp))){
                return false;
            }
            if((sp>=0)!= (tp>=0) ){
                return false;
            }
            sp--;
            tp--;
        }
        return true;
    }
    public static void main(String[] args){
        BackSpaceStringCompare obj = new BackSpaceStringCompare();
        String a = "ab#c";
        String b = "ad#c";
        System.out.println(obj.stringCompare(a,b));
    }
}
