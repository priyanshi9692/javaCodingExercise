package StringProblems;

public class Longest {
    public static String longestSubStringPalin(String s){
        int start = 0;
        int end = 0;
        int len = 0;
        for(int i =0; i<s.length(); i++){
            int len1 = palindrome(s,i,i); //1//1//1
            int len2 = palindrome(s,i, i+1); //0//2
            len = Math.max(len1, len2);
            if(len>(end-start)){
                start = i-(len-1)/2; //0
                end = i+len/2; //0
            }
        }
        return s.substring(start,end+1);
    }
    public static int palindrome(String s, int left, int right){
        if(s == null || left>right){
            return 0;
        }
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;//-1
            right++;//1
        }
        return right-left-1; //1+1-1, //1-0-1
    }
    public static void main (String[] args){
        System.out.println(longestSubStringPalin("cbbd"));
    }
}
// babad
