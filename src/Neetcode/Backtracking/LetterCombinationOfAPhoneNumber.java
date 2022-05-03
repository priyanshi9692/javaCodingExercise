package Neetcode.Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationOfAPhoneNumber {
    public static List<String> letters(String number){
        HashMap<Character, char[]> phoneDict = new HashMap<>();

        phoneDict.put('2', new char[]{'a','b','c'});
        phoneDict.put('3',new char[]{'d','e','f'});
        phoneDict.put('4',new char[]{'g','h','i'});
        phoneDict.put('5',new char[]{'j','k','l'});
        phoneDict.put('6',new char[]{'m','n','o'});
        phoneDict.put('7',new char[]{'p','q','r','s'});
        phoneDict.put('8',new char[]{'t','u','v'});
        phoneDict.put('9',new char[]{'w','x','y','z'});

        List<String> result = new ArrayList<>();
        if(number.length() == 0 || number == null){
            return result;
        }
        letterCombinationRecursion(number, 0, phoneDict, result, new char[number.length()]);
        return result;
    }

    public static void letterCombinationRecursion(String number, int start, HashMap<Character, char[]>map,
                                                  List<String> result, char[] arr){
        if(start == number.length()){
            result.add(new String(arr));
            return;
        }

        char digit = number.charAt(start);
        char[] characters = map.get(digit);
        for(int i =0; i<characters.length; i++){
            arr[start] = characters[i];
            letterCombinationRecursion(number, start+1, map, result, arr);
        }
    }
    public static void main(String[] args){
        System.out.println("Letter Combination: "+ letters("23"));
    }
}
