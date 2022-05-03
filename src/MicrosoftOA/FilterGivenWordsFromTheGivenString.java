package MicrosoftOA;

import java.util.HashMap;

public class FilterGivenWordsFromTheGivenString {
    public static String filterGivenWords(String given, String[] filters){
        StringBuilder result = new StringBuilder();
        String [] strs = given.split(" ");
        HashMap<String, Boolean> map = new HashMap<>();
        for(String filter: filters){
            map.putIfAbsent(filter, true);
        }

        for(String str: strs){
            if(!map.containsKey(str)){
                result.append(str);
                result.append(" ");
            }
        }
        String output = result.toString();
        return output.substring(0, result.length()-1);
    }
    public static void main(String[] args){
        String sentence = "the interview is at microsoft";
        String[] filters = {"a", "the", "and", "at"};
        System.out.println("Resultant String: "+ filterGivenWords(sentence, filters));
    }
}
