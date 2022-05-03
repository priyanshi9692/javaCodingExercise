package Neetcode.DPProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict){
        return wordBreakRecursion(s, new HashSet<>(wordDict), 0, new Boolean[s.length()]);
    }

    public static boolean wordBreakRecursion(String s, HashSet<String> set, int start, Boolean[] memo){
        if(start == s.length()){
            return true;
        }

        if(memo[start]!= null){
            return memo[start];
        }
        for(int end = start+1; end<=s.length(); end++){
            if(set.contains(s.substring(start, end)) && wordBreakRecursion(s, set, end, memo)){
                return memo[start] = true;
            }
        }
        return memo[start]=false;
    }
    public static void main(String[] args){
        System.out.println("Word break is possible: "+ wordBreak("leetcode", new ArrayList<>(Arrays.asList("leet","code"))));
    }
}
