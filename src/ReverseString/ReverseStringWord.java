package ReverseString;

import java.lang.*;
import java.io.*;
import java.util.*;
public class ReverseStringWord {
    public String reverseWords(String str){
        if(str==null || str.length()==0){
            return " ";
        }
        else{
            String[] s= str.split(" ");
            StringBuilder s1= new StringBuilder();
            for(int i= s.length-1; i>=0; i--){
                if(!s[i].equals(" ")){
                    s1.append(s[i]).append(" ");

                }
            }
            return s1.length()==0 ? " " : s1.substring(0, s1.length() - 1);

        }
    }
    public static void main(String[] args) {
            String input="Priyanshi Piyush";
            ReverseStringWord s= new ReverseStringWord();
        System.out.println(s.reverseWords(input));

    }
}
