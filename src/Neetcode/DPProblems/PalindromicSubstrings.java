package Neetcode.DPProblems;

public class PalindromicSubstrings {
    public static int palindromicSubstrings(String s){
        int ans = 0;

        for(int i = 0; i<s.length(); i++){
            // odd length palindromes

            ans+= palindromeCheck(s, i, i);

            // even length palindrome

            ans+= palindromeCheck(s, i, i+1);
        }

        return ans;
    }
    public static int palindromeCheck(String s, int left, int right){
        int ans = 0;
        if(left>right){
            return ans;
        }
        while(left>=0 && right<s.length()){
            if(s.charAt(left)!= s.charAt(right)){
                break;
            }
            left--;
            right++;
            ans++;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println("Number of palindromic substrings: "+ palindromicSubstrings("abc"));
        System.out.println("Number of palindromic substrings: "+ palindromicSubstrings("aaa"));
    }
}
