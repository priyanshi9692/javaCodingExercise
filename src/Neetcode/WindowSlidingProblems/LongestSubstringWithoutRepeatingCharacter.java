package Neetcode.WindowSlidingProblems;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int longestSubStringWithoutRepeatingCharacters(String s){
        HashSet<Character> set = new HashSet<>();

        char[] cArr = s.toCharArray();
        int a =0;
        int b = 0;
        int count = 0;
        while(b<s.length()){
            if(!set.contains(cArr[b])){
                set.add(cArr[b++]);
                count = Math.max(count, set.size());
            }else{
                set.remove(cArr[a++]);
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println("Longest Substring without repeating characters: "+
                longestSubStringWithoutRepeatingCharacters("abcabcbb"));
    }
}
