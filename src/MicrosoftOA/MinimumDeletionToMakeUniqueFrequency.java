package MicrosoftOA;

import java.util.*;

/*
A string s is called good if there are no two different characters in s that have the same frequency.
Given a string s, return the minimum number of characters you need to delete to make s good.
The frequency of a character in a string is the number of times it appears in the string.
For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.

Example 1:

Input: s = "aab"
Output: 0
Explanation: s is already good.
 */
public class MinimumDeletionToMakeUniqueFrequency {
    public static int minimumDeletion(String s){
        char[] cArr = s.toCharArray();
        int minimumDeletes = 0;
        int[] freq = new int[26];
        for(char c: cArr){
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        for(int i = 24; i>=0; i--){
            if(freq[i] == 0){
                break;
            }while(freq[i]>=freq[i+1] && freq[i]!= 0) {
                minimumDeletes++;
                freq[i]--;
            }
        }
        return minimumDeletes;
    }

    public static int minimumDeletionUsingSet(String s){
        // egde conditions
        if(s.length() == 0){
            return 0;
        }

        // let's make a character frequency map
        int[] freq = new int[26];

        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        // I am gonna use HashSet to maintain unique-elements in the freq array
        // I will also use a count int variable that will give me the number of deletion every time
        // I encounter duplicate frequency
        HashSet<Integer>set = new HashSet<>();
        int minDeletions = 0;
        int n = 25;
        while(n>=0){
            int count = freq[n];
            if(count == 0){
                n--;
                continue;
            }
            // Let's check the character frequency in the set and if it is already there, I am gonna try to make it
            // unique

            while(set.contains(count) && count>0){
                count = count-1;
                minDeletions++;
            }
            set.add(count); // implies unique frequency
            n--;
        }
        return minDeletions;

    }
    public static int minimumDeletionsUsingPQ(String s){
        int minDeletions = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(char c: s.toCharArray()){
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c)+1);
            }else {
                charMap.put(c, 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(charMap.values());
        while(!pq.isEmpty()){
            int freq = pq.remove();
            if(pq.contains(freq)){
                freq--;
                minDeletions++;
                if(freq!= 0){
                    pq.add(freq);
                }
            }
        }
        return minDeletions;
    }
    public static void main(String[] args){
        System.out.println("Minimum deletes: "+ minimumDeletion("abcabc"));
        System.out.println("Minimum deletes: "+ minimumDeletionUsingSet("abcabc"));
        System.out.println("Minimum deletes: "+ minimumDeletionsUsingPQ("abcabc"));
    }
}
