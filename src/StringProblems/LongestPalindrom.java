package StringProblems;
/*
Given a string which consists of lowercase or uppercase letters,
find the length of the longest palindromes that can be built with those letters.
This is case sensitive, for example "Aa" is not considered a palindrome here.
 */
public class LongestPalindrom {
    public int longestPalindrom(String str){
        int [] count = new int[128];

       for(char c: str.toCharArray()){
           count[c]++;
       }

        int ans =0;
       for(int v: count){
           ans += v/2*2;
           if(ans%2==0 && v%2==1){
               ans++;
           }
       }
        return ans;
    }
    public static void main(String[] args){
        LongestPalindrom obj = new LongestPalindrom();
        System.out.println(obj.longestPalindrom("charurahc"));
    }
}
