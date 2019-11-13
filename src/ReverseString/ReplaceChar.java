package ReverseString;

import java.util.Arrays;

public class ReplaceChar {
    public String replaceCharacter(String str, int pos, char replacement){
        if(str.length()==0){
            return " ";
        }
        char[] a = str.toCharArray();
        for(int i=0; i<a.length; i++){
            if(i==pos){
                a[i]+=replacement;
            }
            else{
                return " ";
            }
        }

        return str;
    }
    public static void main(String[] args){
        ReplaceChar r= new ReplaceChar();
        System.out.println(r.replaceCharacter("abc", 0, 'e'));
    }
}
