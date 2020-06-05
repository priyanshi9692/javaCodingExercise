package StringProblems;
/*
125. Valid Palindrome
Given a string, determine if it is a palindrome,
considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */
public class ValidPalindrome {
    public boolean isPalindrome(String str){
        if(str.length()==0){
            return true;
        }
       str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]","");
        char[] strarr = str.toCharArray();
        int start=0;
        int end= strarr.length-1;
        while(start<end){
            char temp;
            temp=strarr[start];
            strarr[start]=strarr[end];
            strarr[end]=temp;
            start++;
            end--;
        }
        if(str.equals(new String(strarr))){
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args){
        ValidPalindrome obj = new ValidPalindrome();
        String str = "A man, a plan, a canal: Panama";
        System.out.println(obj.isPalindrome(str));
    }
}
