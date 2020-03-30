package StringProblems;

import java.util.*;

public class AnagramStrings {

    public List<String> funWithAnagrams(List<String> text) {
        List<String> results = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        Set<String> set= new HashSet<>();
        for(int i =0;i<text.size();i++){
            char[] sortedString = text.get(i).toCharArray();
            Arrays.sort(sortedString);
            String sorted = new String(sortedString);
            if(map.containsKey(sorted)){
                set.add(map.get(sorted));
            } else {
                map.put(sorted,text.get(i));
            }
        }
        for(String s: set){
            results.add(s);
        }
        Collections.sort(results);
        return results;

    }
    public static List<String> playWithAnagrams(List<String> text) {
        List<String> results = new ArrayList<>();
        Map<String,String> map = new TreeMap<>();
        for(int i =0;i<text.size();i++){
            char[] sortedString = text.get(i).toCharArray();
            Arrays.sort(sortedString);
            String sorted = new String(sortedString);
            if(map.containsKey(sorted)){
                continue;
            } else {
                map.put(sorted,text.get(i));
            }
        }

        for(Map.Entry<String,String> entry : map.entrySet()){
            results.add(entry.getValue());
        }
        Collections.sort(results);
        return results;



    }
    public static void main(String [] args){
        AnagramStrings obj = new AnagramStrings();
        
    }

}
