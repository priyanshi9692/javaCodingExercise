package NumericProblems;
/*
LeetCode 846. Hand of Straights
Alice has a hand of cards, given as an array of integers.

Now she wants to rearrange the cards into groups so that each group is size W,
and consists of W consecutive cards.

Return true if and only if she can.

Example 1:

Input: hand = [1,2,3,6,2,3,4,7,8], W = 3
Output: true
Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8].
Example 2:

Input: hand = [1,2,3,4,5], W = 4
Output: false
Explanation: Alice's hand can't be rearranged into groups of 4.
 */

import java.util.Arrays;
import java.util.TreeMap;

public class HandOfStraights {
    public boolean handOfStraights(int[] hand, int W){
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int card : hand){
            if(!map.containsKey(card)){
                map.put(card, 1);
            }else{
                map.replace(card, map.get(card)+1);
            }
        }
        while(map.size()>0){
            int firstElement = map.firstKey();
            for(int i = firstElement; i<firstElement+W; i++){
                if(!map.containsKey(i)){
                    return false;
                }
                int count = map.get(i);
                if(count == 1){
                    map.remove(i);
                }else{
                    map.replace(i, map.get(i)-1);
                }
            }
        }
        return true;

    }
    public static void main(String[] args){
        HandOfStraights obj = new HandOfStraights();
        int[] arr = {1,2,3,6,3,2,4,7,8};
        int w = 3;
        System.out.println(obj.handOfStraights(arr,w));
    }

}
