package Visa;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutiveSequence(int[] nums){
        int longestStreak = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        for(int num: set){
            if(set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;

                while(set.contains(currentNum)){
                    currentNum+= 1;
                    currentStreak+= 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args){
        System.out.println("Longest streak: "+ longestConsecutiveSequence(new int[]{400, 4, 100, 2, 3, 1}));
    }
}
