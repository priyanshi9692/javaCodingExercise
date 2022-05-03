package NumericProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class ConvertNestedListInTwoDArray {
    public static int[][] conversion(List<List<Integer>> area){
        int[][] matrix = area.stream().map(list->list.stream().mapToInt(i->i).toArray()).toArray(int[][]::new);
         return matrix;
    }
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,0,0);

        List<Integer> list1 = Arrays.asList(1,0,0);
        List<Integer> list2 = Arrays.asList(1,1,9);
        List<List<Integer>> result = Arrays.asList(list, list1,list2);


        int[][] matrix = conversion(result);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

    }
}
