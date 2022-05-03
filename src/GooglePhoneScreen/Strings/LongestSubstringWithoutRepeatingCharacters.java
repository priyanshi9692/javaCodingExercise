package GooglePhoneScreen.Strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int longestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        int a = 0;
        int b = 0;

        while(b<s.length()){
            if(!set.contains(s.charAt(b))){
                set.add(s.charAt(b));
                b++;
                count = Math.max(count, set.size());
            }else{
                set.remove(s.charAt(a));
                a++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.print("Longest Substring without repeating characters: "+longestSubstring("abcabcbb"));
    }
}
