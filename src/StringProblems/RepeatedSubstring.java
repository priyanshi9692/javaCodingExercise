package StringProblems;
/*

Given a non-empty string check if it can be constructed by taking a substring of it
and appending multiple copies of the substring together.
You may assume the given string consists of lowercase English letters
only and its length will not exceed 10000.
 */
public class RepeatedSubstring {
    public boolean repeatedSubstringPattern(String str) {
        String ss = str + str;
        String sssub = ss.substring(1, ss.length() - 1);
        return sssub.contains(str);
    }
    public static void main(String[] args){
        RepeatedSubstring obj = new RepeatedSubstring();
        System.out.println(obj.repeatedSubstringPattern("ababc"));
    }
}
