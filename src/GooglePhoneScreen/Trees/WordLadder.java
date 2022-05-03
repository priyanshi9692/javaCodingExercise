package GooglePhoneScreen.Trees;

import java.util.*;

public class WordLadder {
    public static int wordLadder(String beginWord, String endWord, List<String> wordDictionary){
        HashSet<String> set = new HashSet<>(wordDictionary);

        if(!set.contains(endWord)){
            return 0;
        }

        // Add beginWord in the queue
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;

        while(!queue.isEmpty()){
            int sizeOfQueue = queue.size();

            for(int i = 0; i<sizeOfQueue; i++){
                String currWord = queue.remove();

                char[] cArr = currWord.toCharArray();
                for(int j = 0; j<cArr.length; j++){
                    char temp = cArr[j];

                    for(char c = 'a'; c<='z'; c++){
                        if(cArr[j] == c){
                            continue;
                        }
                        cArr[j] = c;

                        String transFormedString = String.valueOf(cArr);

                        if(transFormedString.equals(endWord)){
                            return level+1;
                        }
                        if(set.contains(transFormedString)){
                            queue.add(transFormedString);
                            set.remove(transFormedString);
                        }
                    }

                    cArr[j] = temp;
                }
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args){
        List<String> dict = new ArrayList<>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");
        dict.add("cog");

        System.out.println("Ladder Length: "+wordLadder("hit", "cog", dict));

    }
}
