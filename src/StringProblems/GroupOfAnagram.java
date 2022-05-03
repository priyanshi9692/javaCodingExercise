package StringProblems;
/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupOfAnagram {
    public List<List<String>> groupOfAnagram(String[] str){
        if(str.length==0){
            return new ArrayList<>();
        }
        HashMap<String, List> result = new HashMap<>();
        for(String s : str){
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);

            if(!result.containsKey(key)){
            result.put(key, new ArrayList());
            }
            result.get(key).add(s);
        }
        return new ArrayList(result.values());
    }
    public static void main(String[] args){
        GroupOfAnagram obj = new GroupOfAnagram();
        String [] s ={"eat","tea", "tan", "ate", "nat", "bat"};
        System.out.println(obj.groupOfAnagram(s));
    }
}
