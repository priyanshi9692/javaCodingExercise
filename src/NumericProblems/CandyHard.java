package NumericProblems;

import java.util.Arrays;

/*
135. Candy

There are N children standing in a line. Each child is assigned a rating value.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?

Example 1:

Input: [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.

 */
public class CandyHard {
    public int candy(int [] ratings){
        int [] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        for(int i = 1; i<ratings.length; i++){
            if(ratings[i]>ratings[i-1]){
                candies[i] = candies[i-1]+1;
            }
        }
        int sum = candies[ratings.length-1];
        for(int i = ratings.length-2; i>=0; i--){
            if(ratings[i] >ratings[i+1]){
                candies[i] = Math.max(candies[i], candies[i+1]+1);
            }
            sum+=candies[i];
        }
        return sum;
    }
    public static void main(String[] args){
        CandyHard obj = new CandyHard();
        int [] nums = {1,0,2};
        System.out.println(obj.candy(nums));
    }
}
