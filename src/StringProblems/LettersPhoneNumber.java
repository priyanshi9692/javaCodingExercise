package StringProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LettersPhoneNumber {
    public List<String>  phoneNumberToLetters(String digits){
        List<String> result= new ArrayList<>();
        if(digits.length()==0 || digits ==null){
            return result;
        }
        HashMap<Character, char[]> hmap =new HashMap<>();
        hmap.put('2', new char []{'a','b','c'});
        hmap.put('3', new char []{'d','e','f'});
        hmap.put('4', new char []{'g','h','i'});
        hmap.put('5', new char []{'j','k','l'});
        hmap.put('6', new char []{'m','n','o'});
        hmap.put('7', new char []{'p','q','r','s'});
        hmap.put('8', new char []{'t','u','v'});
        hmap.put('9', new char []{'w','x','y','z'});
        char [] arr= new char[digits.length()];
        helper(digits, 0, hmap, result, arr);
        return result;
    }
    private void helper(String digits, int index, HashMap<Character, char[]> hmap, List<String> result, char [] arr){
        if(index==digits.length()){
            result.add(new String(arr));
            return;
        }
        char number=digits.charAt(index);
        char [] options= hmap.get(number);
        for(int i=0; i<options.length; i++){
            arr[index]=options[i];
            helper(digits, index+1, hmap, result, arr);
        }
    }
    public static void main(String [] args){
        LettersPhoneNumber obj =new LettersPhoneNumber();;
        System.out.println(obj.phoneNumberToLetters("39"));
    }

}
