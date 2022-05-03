package Neetcode.DPProblems;
/*
Time complexity: O(N), N is the given number
Space Complexity: O(N), N is the size of one-dimensional dynamic programming
Approach: 1. Fibonacci series
 */
public class ClimbingStairs {
        public static int stepsToClimb(int n){
            if(n == 1){
                return 1;
            }

            int step[] = new int[n+1];
            step[1] = 1;
            step[2] = 2;

            for(int i = 3; i<=n; i++){
                step[i] = step[i-1]+step[i-2];
            }

            return step[n];
        }
        public static void main(String[] args){
            System.out.println("Number of Steps required: "+ stepsToClimb(5));
        }
}
