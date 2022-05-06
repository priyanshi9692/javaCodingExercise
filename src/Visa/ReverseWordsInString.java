package Visa;

public class ReverseWordsInString {
    public static String reverseWords(String s){
        String[] strs = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = strs.length-1; i>=0; i--){
            if(strs[i].length()>0){
                result.append(strs[i]);
                result.append(" ");
            }
        }
        return result.substring(0, result.length()-1).toString();
    }
    public static void main(String[] args){
        System.out.println("Reversed Sentence: "+ reverseWords("the sky is blue"));
        System.out.println("Reversed Sentence: "+ reverseWords("  hello world  "));
        System.out.println("Reversed Sentence: "+ reverseWords("a good   example"));
    }
}
