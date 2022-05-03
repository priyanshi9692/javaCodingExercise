package StringProblems;

import java.util.HashSet;

/*
Given a string, find the length of the longest substring without repeating characters.
*/
public class LongestSubstringWithoutRepeatingLetters {
    public int longestSubstring(String str){
        if(str.length() == 0 || str == null){
            return 0;
        }
        HashSet<Character> hset = new HashSet<>();
        int result = 1;
        int i = 0;

        for(int j = 0; j < str.length(); j++){
            char c = str.charAt(i);
            if(!hset.contains(c)){

                hset.add(c);
                result = Math.max(result, hset.size());
            }else{
                while(i<j){
                    if(str.charAt(i)== c){
                        i++;
                        break;

                    }
                    hset.remove(str.charAt(i));
                    i++;
                }
            }
        }
        return (result);
    }

    public int longestSubstringWithoutRepeatCharacter(String str){
        int max = 0;
        int left = 0;
        int right = 0;
        HashSet<Character> hset = new HashSet<>();

        while(right<str.length()){
            if(!hset.contains(str.charAt(right))){
                hset.add(str.charAt(right));
                right++;
                max = Math.max(max, hset.size());
            }else{
                hset.remove(str.charAt(left));
                left++;
            }
        }
        return max;
    }
    public int reverseANumber(int num){
        int result = 0;
        while(num!=0){
            int rem = num%10;
            num = num/10;
            if(result>Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && rem > 7)){
                return 0;
            }
            if(result<Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && rem < -8)){
                return 0;
            }
            result = result*10+rem;


        }
        return result;
    }
    public boolean isPalindromNum(int num){
        if(num == 0){
            return true;
        }
        if(num<0 || num/10 == 0){
            return false;
        }
        int reversed =0;
        while(num>reversed){
            int rem = num%10;
            num = num/10;
            reversed = reversed*10 + rem;
        }
        if(num == reversed || num == reversed/10){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args){
        LongestSubstringWithoutRepeatingLetters obj = new LongestSubstringWithoutRepeatingLetters();
        System.out.println(obj.longestSubstringWithoutRepeatCharacter("abcabcbb"));
        System.out.println(obj.reverseANumber(-123));
        System.out.println(obj.isPalindromNum(12321));
    }
}
