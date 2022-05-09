package Neetcode.TwoPointer;

public class ValidPalindrome {
    public static boolean validPalindrome(String s){
        if(s == ""){
            return true;
        }

        String removeAlphaNumberic = s.replaceAll("[^a-zA-Z0-9]", " ")
                                        .replaceAll("\\s","");
        String convertToLowerCase = removeAlphaNumberic.toLowerCase();
        return isValidPalindrome(convertToLowerCase);
    }
    public static boolean isValidPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<=right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("Valid Palindrome: "+ validPalindrome("A man, a plan, a canal: Panama"));
    }
}
