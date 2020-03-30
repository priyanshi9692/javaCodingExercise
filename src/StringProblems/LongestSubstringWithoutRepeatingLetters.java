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
    public static void main(String[] args){
        LongestSubstringWithoutRepeatingLetters obj = new LongestSubstringWithoutRepeatingLetters();
        System.out.println(obj.longestSubstring("abcabcbb"));
    }
}
