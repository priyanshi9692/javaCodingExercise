package StringProblems;
/*
Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*'.

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).

Note:

s could be empty and contains only lowercase letters a-z.
p could be empty and contains only lowercase letters a-z, and characters like ? or *.
Example 1:

Input:
s = "aa"
p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
 */

public class WildcardMatching {
    public boolean matchingStrings(String s, String p){
        int i = 0;
        int j = 0;
        int starIndex = -1;
        int index = -1;
        while (i<s.length()){
            if(j<p.length() && (p.charAt(j)=='?' || p.charAt(j)==s.charAt(i))){
                ++j;
                ++i;
            }else if(j<p.length() && p.charAt(j)=='*'){
                starIndex = j;
                index = i;
                ++j;
            }else if(starIndex!=-1){
                j = starIndex+1;
                i = index+1;
                index++;
            }else{
                return false;
            }
        }
        while(j<p.length() && p.charAt(j)=='*'){
            j++;
        }
        return j == p.length();
    }
    public static void main(String[] args ){
        WildcardMatching obj = new WildcardMatching();
        String s = "aa";
        String p = "*";
        System.out.println(obj.matchingStrings(s,p));
    }
}
