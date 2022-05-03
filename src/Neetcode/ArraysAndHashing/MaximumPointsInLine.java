package Neetcode.ArraysAndHashing;

import java.util.HashMap;

/*
Time complexity: O(N^2)
Space Complexity: O(N) use of HashMap

 */
public class MaximumPointsInLine {
    public static int maxPoints(int[][] points){
        HashMap<Integer, HashMap<Integer, Integer>> countMap = new HashMap<>();
        int x1, x2, y1, y2;
        int  maxPoints = 0;
        for(int i = 0; i<points.length; i++){
            countMap.clear();

            for(int j = i+1; j<points.length; j++){
                x1 = points[i][0];
                x2 = points[j][0];
                y1 = points[i][1];
                y2 = points[j][1];

                int xDiff = x2-x1;
                int yDiff = y2-y1;

                int gcd = greatestCommonDivisor(xDiff, yDiff);

                int dx = xDiff/gcd;

                int dy = yDiff/gcd;

                if(!countMap.containsKey(dx)){
                    countMap.put(dx, new HashMap<>());
                }
                countMap.get(dx).put(dy, countMap.get(dx).getOrDefault(dy, 0)+1);
                maxPoints = Math.max(maxPoints, countMap.get(dx).get(dy));
            }
        }
        return maxPoints+1;
    }
    public static int greatestCommonDivisor(int a, int b){
        if(b == 0){
            return a;
        }
        return greatestCommonDivisor(b, a%b);
    }
    public static void main(String[] args){
        int[][] points = {
                {1,1},{2,2},{3,3}
        };
        System.out.println("Maximum number of points in a line: "+maxPoints(points));
    }
}
