package NumericProblems;
/*
Given an integer array with even length,
where different numbers in this array represent different kinds of candies.
Each number means one candy of the corresponding kind.
You need to distribute these candies equally in number to brother and sister.
Return the maximum number of kinds of candies the sister could gain.
 */

import java.util.HashSet;

public class DistributeCandies {
    public int distributeCandies(int [] candies){
        if(candies.length%2!=0 || candies==null){
            return 0;
        }
        HashSet<Integer> hset = new HashSet<>();
        for(int s: candies){
            hset.add(s);
        }
        return Math.min(hset.size(), candies.length/2 );
    }
    public static void main(String[] args){
        DistributeCandies obj = new DistributeCandies();
        int [] arr= {1,1,2,2,3,3};
        System.out.println(obj.distributeCandies(arr));
    }
}
