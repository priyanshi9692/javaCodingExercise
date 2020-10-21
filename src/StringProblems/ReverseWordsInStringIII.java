package StringProblems;
/*
Given a string, you need to reverse the order of characters in each word within a sentence,
while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
 */

public class ReverseWordsInStringIII {
    public String reverseStringIII(String s){
        if(s.length()==0){
            return null;
        }
        String [] eachString = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String words: eachString){
            result.append(new StringBuilder(words).reverse().toString() +" ");
        }
        return result.toString().trim();
    }
    public static void main(String[] args){
        ReverseWordsInStringIII obj = new ReverseWordsInStringIII();
        String s = "Let's take LeetCode contest";
        System.out.println(obj.reverseStringIII(s));
    }
}
