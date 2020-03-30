package StringProblems;

import java.util.ArrayList;

public class ReverseVowels {
    public String reverseVowels(String s){
        if(s.length()==0){
            return s;
        }
        ArrayList<Character> vowel= new ArrayList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        char [] arr= s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(!vowel.contains(arr[start])){
                start++;
                continue;
            }
            if(!vowel.contains(arr[end])){
                end--;
                continue;
            }
            char t=arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            start++;
            end--;
        }
        return new String(arr);

    }
    public static void main(String [] args){
        ReverseVowels obj=new ReverseVowels();
        String s="Charu";
        System.out.println(obj.reverseVowels(s));
    }
}
