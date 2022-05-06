package Visa;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static String largestNumber(int[] nums){
        String[] strs = new String[nums.length];
        int i = 0;
        for(int num: nums){
            strs[i++] = String.valueOf(num);
        }

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String order1 = o1+o2;
                String order2 = o2+o1;
                return order2.compareTo(order1);
            }
        });

        if(strs[0].equals("0")){
            return "0";
        }

        StringBuilder result = new StringBuilder();

        for(String num: strs){
            result.append(num);
        }

        return result.toString();
    }

    public static void main(String[] args){
        System.out.println("Largest Number: "+ largestNumber(new int[]{10, 2}));
        System.out.println("Largest Number: "+ largestNumber(new int[]{3,30,34,5,9}));
    }
}
