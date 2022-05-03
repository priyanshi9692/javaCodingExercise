package StringProblems;
/*
You are given an array of strings str, the task is to find the score of a given string s from the array.
The score of a string is defined as the product of the sum of its characters’s alphabetical values with
the position of the string in the array.

Examples:

Input: str[] = {“sahil”, “shashanak”, “sanjit”, “abhinav”, “mohit”}, s = “abhinav”
Output: 228
Sum of alphabetical values of “abhinav” = 1 + 2 + 8 + 9 + 14 + 1 + 22 = 57
Position of “abhinav” in str is 4, 57 x 4 = 228

Input: str[] = {“geeksforgeeks”, “algorithms”, “stack”}, s = “algorithms”
Output: 244
 */
public class AlphabeticSum {
    public int sumOfAlphas(String[] str, String s){
        int score = 0;
        int index = 0;
        for(int i =0; i<str.length; i++){
            if(str[i] == s){
                for(int j =0; j<s.length(); j++){

                    score += s.charAt(j) -'a' + 1;
                }
                index= i+1;
                break;
            }

        }
        score = index*score;
        return score;
    }
    public static void main(String[] args){
        AlphabeticSum obj = new AlphabeticSum();
        String str [] = {"sahil", "shashanak"
                , "sanjit", "abhinav", "mohit"};
        System.out.println(obj.sumOfAlphas(str, "abhinav"));
    }
}
