package Neetcode.Strings;

import java.util.HashSet;

public class PalindromePermutations {
    public static boolean palindromePermutations(String s){
        HashSet<Character> hset = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            if(!hset.add(s.charAt(i))){
                hset.remove(s.charAt(i));
            }
        }
        return hset.size()<=1;
    }

    public static void main(String[] args){
        System.out.println("Palindrome Pemutations: "+ palindromePermutations("code"));
        System.out.println("Palindrome Pemutations: "+ palindromePermutations("aab"));
    }
}
