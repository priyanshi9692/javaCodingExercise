package ReverseString;

import java.lang.*;
import java.io.*;
import java.util.*;
public class ReverseString {

    public static void main(String[] args) {
            String input="Priyanshi Jajoo";
            char[] s= input.toCharArray();
            int start=0;
            int end= s.length-1;
            while(start<end){
                char temp;
                temp=s[start];
                s[start]=s[end];
                s[end]=temp;
                start++;
                end--;
            }
            System.out.println(s);
    }
}
// Time Complexity=O(n); Space Complexity=O(1)
