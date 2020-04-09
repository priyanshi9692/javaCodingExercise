package NumericProblems;
/*
The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
You can do so recursively, in other words from the previous member read off the digits,
counting the number of digits in groups of the same digit.

Note: Each term of the sequence of integers will be represented as a string.
 */
public class CountAndSay {
    public String countAndSay(int n){
        if(n<=0){
            return null;
        }
        String result = "1";
        int i = 1;
        while(i<n){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j = 1; j <result.length(); j++){
                if(result.charAt(j) == result.charAt(j-1)){
                    count++;
                }
                else{
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(result.charAt(result.length()-1));
            result = sb.toString();
            i++;
        }
        return result;
    }

    public static void main(String[] args){
        CountAndSay obj = new CountAndSay();
        System.out.println(obj.countAndSay(5));
    }

}
