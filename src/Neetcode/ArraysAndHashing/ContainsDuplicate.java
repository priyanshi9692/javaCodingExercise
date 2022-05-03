package Neetcode.ArraysAndHashing;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }else{
                set.add(num);
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println("Contains Duplicates: "+ containsDuplicates(new int[]{1,2,3,1}));
        System.out.println("Contains Duplicates: "+ containsDuplicates(new int[]{1,2,3,4}));
        System.out.println("Contains Duplicates: "+ containsDuplicates(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
