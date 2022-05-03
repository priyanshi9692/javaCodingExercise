package StringProblems;

import LinkedList.LinkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/*
A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words
beginWord -> s1 -> s2 -> ... -> sk such that:

Every adjacent pair of words differs by a single letter.
Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
sk == endWord
Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest
transformation sequence from beginWord to endWord, or 0 if no such sequence exists.



Example 1:

Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
Output: 5
Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.
 */
public class WordLadder {

    public static int wordLadder(String beginWord, String endWord, List<String> wordList){
        HashSet<String> set = new HashSet<>(wordList);

        Queue<String> queue = new LinkedList<>();

        if(!set.contains(endWord)){
            return 0;
        }
        queue.add(beginWord);
        int level = 1;

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i<size; i++){
                String currWord = queue.poll();
                char[] wordArray = currWord.toCharArray();
                for(int j = 0; j<wordArray.length; j++){
                    char temp = wordArray[j];
                    for(char c = 'a'; c<='z'; c++){
                        if(wordArray[j] == c){
                            continue;
                        }
                        wordArray[j] = c;

                        String transformedWord = String.valueOf(wordArray);

                        if(endWord.equals(transformedWord)){
                            return level+1;
                        }

                        if(set.contains(transformedWord)){
                            queue.add(transformedWord);
                            set.remove(transformedWord);
                        }
                    }
                    wordArray[j] = temp;
                }
            }
            level++;
        }
        return 0;
    }
    public static void main(String[] args){
        List<String> wordDict = Arrays.asList("hot","dot","dog","lot","log","cog");
        System.out.println(wordLadder("hit", "cog", wordDict));
    }
}
