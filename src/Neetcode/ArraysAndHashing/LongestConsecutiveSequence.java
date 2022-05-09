package Neetcode.ArraysAndHashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutiveSequence(int[] nums){
        int longestStreak = 0;
        HashSet<Integer>set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        for(int num: nums){
            if(!set.contains(num-1)){
                int currNum = num;
                int currentStreak = 1;
                while(set.contains(currNum+1)){
                    currNum+=1;
                    currentStreak+=1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
    public static void main(String[] args){
        System.out.println("Longest Streak: "+ longestConsecutiveSequence(new int[]{100,4,200,1,3,2}));
    }
}
