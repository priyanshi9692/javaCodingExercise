package Neetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static List<List<String>> palindromePartitions(String s){
        List<List<String>> result = new ArrayList<>();
        if(s.length() == 0){
            return result;
        }
        palindromePartitionsRecursion(s, 0, result, new ArrayList<>());
        return result;
    }
    public static void palindromePartitionsRecursion(String s, int start, List<List<String>> result, List<String> list){
        if(start >= s.length()){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int nextI = start; nextI<s.length(); nextI++){
            if(isPalindrome(s, start, nextI)){
                list.add(s.substring(start, nextI+1));
                palindromePartitionsRecursion(s, nextI+1, result, list);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s, int left, int right){
        if(left>right){
            return false;
        }

        while(left<right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("Palindrome Partitioning: "+ palindromePartitions("aab"));
    }
}
