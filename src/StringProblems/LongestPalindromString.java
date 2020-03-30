package StringProblems;
/*
Given a string s, find the longest palindromic substring in s.
You may assume that the maximum length of s is 1000.
 */
public class LongestPalindromString {
    public String longestPalindromSubstring(String str){
        if(str.length() == 0){
            return null;
        }
        if(str.length() == 1){
            return str;
        }
        String longest = str.substring(0,1);
        for(int i=0; i<str.length(); i++){
            String temp = helperFunction(str, i, i );
            if(temp.length() > longest.length()){
                longest = temp;
            }
            temp = helperFunction(str, i, i+1);
            if(temp.length() > longest.length()){
                longest = temp;
            }
        }
        return longest;
    }
    public String helperFunction(String str, int start, int end){
        while(start>=0 && end <= str.length()-1 && str.charAt(start)==str.charAt(end)){
            start --;
            end ++;
        }
        return str.substring(start+1, end);
    }
    public static void main(String[] args){
        LongestPalindromString obj = new LongestPalindromString();
        System.out.println(obj.longestPalindromSubstring("babadac"));
    }



}
