package MicrosoftOA;

import TreeTraversal.SymmetryTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MaxLengthOfConcatenatedString {
    private static int result = 0;
    public static int maxLengthOfConcatenatedString(List<String> words){
        if(words.size() == 0 || words == null){
            return result;
        }
        letsExploreInTheTree(words, "", 0);
        return result;
    }

    public static void letsExploreInTheTree(List<String> words, String inMaking, int index){
        boolean isUnique = isAUniqueString(inMaking);

        if(isUnique){
            result = Math.max(result, inMaking.length());
        }
        if(index == words.size() || !isUnique){
            return;
        }
        for(int i = index; i<words.size(); i++){
            letsExploreInTheTree(words, words.get(i)+inMaking, i+1);
        }
    }

    public static boolean isAUniqueString(String s){
        char[] cArr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(char c: cArr){
            if(set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }
    public static void main(String[] args){
        List<String> list = new ArrayList<String>(){{
            add("un");
            add("iq");
            add("ue");
        } };
        System.out.println(maxLengthOfConcatenatedString(list));
    }
}
