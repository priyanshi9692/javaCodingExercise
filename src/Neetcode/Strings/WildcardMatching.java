package Neetcode.Strings;

public class WildcardMatching {
    public static boolean wildcardMatching(String str, String pattern){
        if(str == null || pattern == null){
            return false;
        }

        int indexS = 0;
        int indexP = 0;
        int starIndex = -1;
        int indexPtr = -1;

        while(indexS<str.length()){
            if(indexP<pattern.length() && ((pattern.charAt(indexP) == '?')
                    || pattern.charAt(indexP) == str.charAt(indexS))){
                indexP++;
                indexS++;
            }else if(indexP<pattern.length() && pattern.charAt(indexP) == '*'){
                starIndex = indexP;
                indexPtr = indexS;
                indexP++;
            }else if(starIndex!= -1){
                indexP = starIndex+1;
                indexS = indexPtr+1;
                indexPtr++;
            }else{
                return false;
            }
        }

        while(indexP<pattern.length() && pattern.charAt(indexP) == '*'){
            indexP++;
        }

        return indexP == pattern.length();
    }

    public static void main(String[] args){
        System.out.println("Is wildcard match? :"+ wildcardMatching("aa", "a"));
        System.out.println("Is wildcard match? :"+ wildcardMatching("aa", "*"));
        System.out.println("Is wildcard match? :"+ wildcardMatching("cb", "?a"));
        System.out.println("Is wildcard match? :"+ wildcardMatching("aab", "a*c"));
    }
}
