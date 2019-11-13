package ReverseString;

import java.util.HashMap;

public class RepetitiveLetters {
    public HashMap<Character, Integer> repetitiveLetters(String s){
        if(s.length()==0){
            return null;
        }
        String str1=s.toLowerCase();
        char[] s1= str1.toCharArray();
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0; i<s1.length; i++){
            if (hmap.containsKey(s1[i])) {
                hmap.put(s1[i], hmap.get(s1[i])+1);
            } else {
                hmap.put(s1[i], 1);
                }
            }
        return hmap;
    }

    public static void main(String[] args){
        RepetitiveLetters str= new  RepetitiveLetters();

        System.out.println(str.repetitiveLetters("priyanshi"));

    }
}
