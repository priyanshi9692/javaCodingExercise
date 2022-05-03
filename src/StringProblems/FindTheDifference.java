package StringProblems;

public class FindTheDifference {
    public char findTheDiff(String s, String t){
        char c =0;
        for(int i =0; i<t.length(); i++){
            c += t.charAt(i);
        }
        for(int i =0; i<s.length(); i++){
            c -= s.charAt(i);
        }
        return c;
    }
    public static void main(String[] args){
        FindTheDifference obj = new FindTheDifference();
        System.out.println(obj.findTheDiff("ay","ayb"));
    }
}
