package Neetcode.ArraysAndHashing;

import java.util.*;

public class ValidAnagrams {
    public static boolean isValidAnagram(String s, String t){
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if(sArr.length!= tArr.length){
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c: sArr){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }
        for(char c: tArr){
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }

        return map1.equals(map2);
    }

    public static void main(String[] args){
        System.out.println("Is a valid Anagram: "+isValidAnagram("anagram","nagaram"));
        System.out.println("Is a valid Anagram: "+isValidAnagram("rat","car"));
    }
}
