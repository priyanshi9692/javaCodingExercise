package NumericProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class Stream {

    public static void main(String[] args){
        List<String> input = Arrays.asList("Priyanshi,", "Prasad", "Ashish", "Asha");

     input.stream().filter(x->x.startsWith("A")).forEach(System.out :: println);
        String str = "charu";

        int start = 0;
        int end = str.length()-1;
        char[] c_arr = str.toCharArray();
        while(start<=end){
            char temp = c_arr[start];
            c_arr[start] = c_arr[end];
            c_arr[end] =temp;
            start++;
            end--;
        }

       System.out.println(String.valueOf(c_arr)) ;

    }
}
