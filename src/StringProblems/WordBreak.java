package StringProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a
space-separated sequence of one or more dictionary words.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

 Example 1:

Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
 */
public class WordBreak {

    public  static boolean wordBreak(String s, List<String> wordDict){
        return wordBreakMemo(s, new HashSet<>(wordDict), 0, new Boolean[s.length()]);
    }

    public static boolean wordBreakMemo(String s, HashSet<String> set, int start, Boolean[]memo){
        if(start == s.length()){
            return true;
        }

        if(memo[start]!= null){
            return memo[start];
        }

        for(int end = start+1; end<=s.length(); end++){
            if(set.contains(s.substring(start, end)) && wordBreakMemo(s, set, end, memo)){
               return memo[start] = true;
            }
        }
        return memo[start] = false;
    }

    public static void main(String[] args){

        List<String> wordDict = Arrays.asList("leet", "code");

        String s = "leetcode";

        System.out.println("Word break: "+ wordBreak(s,wordDict));

    }
}
