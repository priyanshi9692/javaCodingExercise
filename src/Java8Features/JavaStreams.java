package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaStreams {

    public static void main(String[] args){
        // Instream
        System.out.println("Instream");
        IntStream.range(1,11).forEach((c)->System.out.print(c+"\t"));
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Given Array Filter out even numbers");

        // Given Array Filter out even numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evens = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
        evens.stream().forEach((c) -> System.out.print(c+"\t"));
        System.out.println();
        System.out.println("-------------------------------------");

        // Given String Array, find all the string with first character P
        System.out.println("Given String Array, find all the string with first character P");
        List<String> words = Arrays.asList("Priyanshi", "Shreyashi", "Piyush", "Siddhi", "Aishverya");
        words.stream().filter(s-> s.startsWith("P")).forEach((c)->System.out.println(c));
        System.out.println("-------------------------------------");


        // Sort the String arraylist
        System.out.println("Sort the String arraylist");
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = names.stream().sorted().collect(Collectors.toList());
        result.forEach((c)->System.out.println(c));
        System.out.println("-------------------------------------");

        // Distinct numbers and their square
        System.out.println("Sort the String arraylist");
        List<Integer> nums = Arrays.asList(1,2,3,1,4,5,2);
        List<Integer> ans = nums.stream().distinct().map(x->x*x).collect(Collectors.toList());
        ans.forEach((c)->System.out.println(c));
        System.out.println("-------------------------------------");

        // Sort the String arraylist
        System.out.println("Sort the String arraylist");
        List<Integer> numerals = Arrays.asList(1,2,3,1,4,5,2);
        Set<Integer> answer = numerals.stream().map(x->x*x).collect(Collectors.toSet());
        answer.forEach((c)->System.out.println(c));
        System.out.println("-------------------------------------");

    }
}
