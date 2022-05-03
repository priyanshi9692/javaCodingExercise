package Neetcode.Graphs;

import java.util.*;

public class WordLadder {
    public static int wordLadder(String beginWord, String endWord, List<String> wordList){
        HashSet<String> wordDict = new HashSet<>(wordList);
        if(!wordDict.contains(endWord)){
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i<size; i++){
                String word = queue.remove();

                char[] cArr = word.toCharArray();

                for(int j = 0; j<cArr.length; j++){
                    char temp = cArr[j];
                    for(char c = 'a' ; c<='z'; c++){
                        if(cArr[j] == c){
                            continue;
                        }
                        cArr[j] = c;
                        String transFormed = String.valueOf(cArr);
                        if(endWord.equals(transFormed)){
                            return level+1;
                        }
                        if(wordDict.contains(transFormed)){
                            queue.add(transFormed);
                            wordDict.remove(transFormed);
                        }
                    }
                    cArr[j] = temp;
                }
            }
            level++;
        }
        return 0;
    }
    public static void main(String[] args){
        List<String> wordList = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));

        System.out.println("Word Ladder: "+ wordLadder("hit", "cog", wordList));
    }
}
