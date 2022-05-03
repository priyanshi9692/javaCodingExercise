package NumericProblems;
/*
Count Items Matching a Rule
You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color,
and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
 ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

 */
public class CountMatchingRule {
    public static int countMatches(List<List<String>>items, String ruleKey, String ruleValue){
        int count = 0;

        for(List<String> item: items){
            if(ruleKey.equals("type")){
                if(ruleValue.equals(item.get(0))){
                    count++;
                }
            }
            if(ruleKey.equals("color")){
                if(ruleValue.equals(item.get(1))){
                    count++;
                }
            }
            if(ruleKey.equals("name")){
                if(ruleValue.equals(item.get(2))){
                    count++;
                }
            }
        }
        return count;
    }

    public static int countMatchesRule(List<List<String>>items, String ruleKey, String ruleValue){
        HashMap<String, Integer> hmap = new HashMap<>();

        hmap.put("type", 0);
        hmap.put("color", 1);
        hmap.put("name", 2);
        int count = 0;
        int key = hmap.get(ruleKey);
        for(List<String> item: items){
            if(item.get(key).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
       List<List<String>> items = new ArrayList<>();
       List<String> item = new ArrayList<>();
       item.add("phone");
       item.add("blue");
       item.add("pixel");
       items.add(item);
        List<String> item1 = new ArrayList<>();
        item1.add("computer");
        item1.add("silver");
        item1.add("lenovo");
        items.add(item1);
        List<String> item2 = new ArrayList<>();
        item2.add("phone");
        item2.add("gold");
        item2.add("iphone");
        items.add(item2);

        // Slower Code
        System.out.println("countMatches: "+countMatches(items,"type","phone" ));

        // Faster Code
        System.out.println("countMatchesRule: "+countMatchesRule(items,"type","phone" ));

    }
}
