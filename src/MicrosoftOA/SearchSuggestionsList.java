package MicrosoftOA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchSuggestionsList {
    
    public static List<List<String>> searchSuggestions(String [] products, String searchWord){
        List<String> sortedProductList = Arrays.stream(products).sorted().collect(Collectors.toList());
        char[] cArr = searchWord.toCharArray();
        List<List<String>> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        for(char c: cArr){
            current.append(c);
            String prefix = current.toString();
            sortedProductList = sortedProductList.stream().filter(word->word.startsWith(prefix)).collect(Collectors.toList());

            List<String> selectedWords = sortedProductList.stream().limit(3).collect(Collectors.toList());
            result.add(selectedWords);
        }
        return result;
    }

    public static void main(String[] args){

        String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
        System.out.println("Search Array: "+ searchSuggestions(products,"mouse"));
    }
}
