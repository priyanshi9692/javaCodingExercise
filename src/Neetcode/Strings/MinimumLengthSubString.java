package Neetcode.Strings;

import java.util.HashMap;

public class MinimumLengthSubString {
    public static String minimumWindow(String s, String t){
        if(s.length() == 0 || s.length()<t.length()){
            return "";
        }

        HashMap<Character, Integer> map = new HashMap<>();
        char[] tArr = t.toCharArray();

        // Build HashMap
        for(char c: tArr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }

        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int min = 0;
        int count = 0;

        for(int end = 0 ; end<s.length(); end++){
            if(map.containsKey(s.charAt(end))){
                map.put(s.charAt(end), map.get(s.charAt(end))-1);
                if(map.get(s.charAt(end))>=0){
                    count++;
                }
            }

            while(count == t.length()){
                if(minLen>end-start+1){
                    minLen = end-start+1;
                    min = start;
                }
                if(map.containsKey(s.charAt(start))){
                    map.put(s.charAt(start), map.get(s.charAt(start))+1);
                    if(map.get(s.charAt(start))>0){
                        count--;
                    }
                }
                start++;
            }
        }
        if(minLen>s.length()){
            return "";
        }
        return s.substring(min, min+minLen);
    }
    public static void main(String[] args){
        System.out.println("Minimum Window Substring: "+ minimumWindow("ADOBECODEBANC","ABC"));
    }
}
