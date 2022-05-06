package Visa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            char[] cArr = str.toCharArray();
            Arrays.sort(cArr);
            String key = String.valueOf(cArr);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Group Anagram: "+ groupAnagrams(strs));
    }
}
