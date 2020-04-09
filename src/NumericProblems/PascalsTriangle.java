package NumericProblems;

import java.util.ArrayList;
import java.util.List;

/*
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
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
public class PascalsTriangle {
    public List<List<Integer>>  generatePascalTriangle(int numRows ){
        List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0)
            return result;

        ArrayList<Integer> pre = new ArrayList<>();
        pre.add(1);
        result.add(pre);

        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> cur = new ArrayList<>();

            cur.add(1);
            for (int j = 0; j < pre.size() - 1; j++) {
                cur.add(pre.get(j) + pre.get(j + 1));
            }
            cur.add(1);

            result.add(cur);
            pre = cur;
        }

        return result;
    }
    public static void main(String [] args){
        PascalsTriangle obj = new PascalsTriangle();
        System.out.println(obj.generatePascalTriangle(5));

    }

}
