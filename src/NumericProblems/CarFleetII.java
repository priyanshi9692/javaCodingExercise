package NumericProblems;

import java.util.ArrayDeque;
import java.util.Deque;

/*
There are n cars traveling at different speeds in the same direction along a one-lane road.
You are given an array cars of length n, where cars[i] = [positioni, speedi] represents:

positioni is the distance between the ith car and the beginning of the road in meters.
It is guaranteed that positioni < positioni+1.
speedi is the initial speed of the ith car in meters per second.
For simplicity, cars can be considered as points moving along the number line.
Two cars collide when they occupy the same position. Once a car collides with another car,
they unite and form a single car fleet. The cars in the formed fleet will have the same position
and the same speed, which is the initial speed of the slowest car in the fleet.

Return an array answer, where answer[i] is the time, in seconds, at which the ith car collides
with the next car, or -1 if the car does not collide with the next car.
Answers within 10-5 of the actual answers are accepted.

Example 1:
Input: cars = [[1,2],[2,1],[4,3],[7,2]]
Output: [1.00000,-1.00000,3.00000,-1.00000]
Explanation: After exactly one second, the first car will collide with the second car,
and form a car fleet with speed 1 m/s. After exactly 3 seconds, the third car will collide with
the fourth car, and form a car fleet with speed 2 m/s.

Example 2:

Input: cars = [[3,4],[5,4],[6,3],[9,1]]
Output: [2.00000,1.00000,1.50000,-1.00000]

 */
public class CarFleetII {
    public static double[] getCollisionTimes(int[][] cars){
        final int N = cars.length;
        double[] result = new double[N];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = N-1; i>=0; i--){
            result[i] = -1;
            // pop out cars with speed >= current car's speed

            while(!stack.isEmpty() && cars[i][1] <=cars[stack.peek()][1]){
                stack.pollFirst();
            }

            // check if the next car will collide the next car before current car collides next car
            // if so, current car will collide the next next car instead of the next car

            while(!stack.isEmpty()){
                int next = stack.peekFirst();
                result[i] = (double) (cars[next][0] - cars[i][0])/(cars[i][1] - cars[next][1]);
                if(result[stack.peekFirst()]!= -1 && result[i]>= result[stack.peekFirst()]){
                    stack.pollFirst();
                }else{
                    break;
                }
            }
            stack.offerFirst(i);
        }
        return result;
    }

    public static void main(String[] args){
        int[][] cars = {
                {1,2},
                {2,1},
                {4,3},
                {7,2}
        };
        int[][] diffCars = {
                {3,4},
                {5,4},
                {6,3},
                {9,1}
        };

       double[]getCollisionList = new double[diffCars.length];
        getCollisionList = getCollisionTimes(diffCars);

        for(int i = 0; i<getCollisionList.length; i++){
            System.out.print(getCollisionList[i]+","+"\t");
        }
    }
}
