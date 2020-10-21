package NumericProblems;
/*
LeetCode 118. Pascals Triangle
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {
    public List<List<Integer>> pascalsTriangle(int numsRow){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);

        for(int i = 1; i<numsRow; i++){
            List<Integer> prev = result.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1; j<i; j++){
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            result.add(curr);
        }
        return result;
    }
    public static void main(String[] args){
        PascalsTriangle118 obj = new PascalsTriangle118();
        System.out.println(obj.pascalsTriangle(5));
    }

}
