package StringProblems;
/*
Given a string s and a string t, check if s is subsequence of t.
You may assume that there is only lower case English letters in both s and t.
t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).
A subsequence of a string is a new string which is formed from the original string by deleting some (can be none)
of the characters without disturbing the relative positions of the remaining characters.
(ie, "ace" is a subsequence of "abcde" while "aec" is not).
 */


public class IsSubsequence {
    public boolean isSubsequence(String s, String t){
        if(s == null || s.length()==0){
            return true;
        }
        int i=0;
        for(int j=0; j<t.length(); j++ ){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            if(i == s.length()){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        IsSubsequence obj = new IsSubsequence();
        System.out.println(obj.isSubsequence("abc", "abdjuec"));
    }
}
