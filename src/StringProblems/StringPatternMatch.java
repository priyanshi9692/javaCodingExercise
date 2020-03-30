package StringProblems;

import java.util.ArrayList;

public class StringPatternMatch {
    public boolean stringPatternMatch(String s, String Pattern){
        if(s==null || Pattern ==null || s.length()==0 || Pattern.length()==0){
            return false;
        }
        ArrayList<Integer> list = KMPArray(Pattern);
        int i=0;
        int j=0;
        while(i<s.length() && j<Pattern.length()){
            if(s.charAt(i)==Pattern.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j!=0){
                    j= list.get(j-1);
                }
                else{
                    i++;
                }
            }
        }
        return j== Pattern.length() ? true : false;
    }
    public ArrayList<Integer> KMPArray(String Pattern){
        ArrayList<Integer> list =new ArrayList<>();
        int i=0;
        int j=1;
        while(j<Pattern.length()){
            if(Pattern.charAt(i)==Pattern.charAt(j)){
                list.add(i+1);
                j++;
                i++;
            }
            else{
                if(i!=0){
                    i = list.get(i-1);
                }
                else{
                    list.add(0);
                    j++;
                }
            }
        }
        return list;

    }
    public static void main(String [] args){
        StringPatternMatch obj =new StringPatternMatch();
        String s= "abcdefxdbcdef";
        String Pattern= "dbcdef";
        System.out.println(obj.stringPatternMatch(s,Pattern));
    }
}
