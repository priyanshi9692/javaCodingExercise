package NumericProblems;
/*
746. Min Cost Climbing Stairs
On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.

Example 1:
Input: cost = [10, 15, 20]
Output: 15
Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
 */
public class MinCostClimbing {
    public int minCostClimb(int[] cost){
        if(cost.length==0){
            return 0;
        }
        int f1=0, f2=0;
        for(int i =cost.length-1; i>=0; i--){
            int f0 = cost[i]+Math.min(f1,f2);
            f2=f1;
            f1=f0;
        }
        return Math.min(f2,f2);
    }
    public static void main(String[] args){
        MinCostClimbing obj = new MinCostClimbing();
        int [] arr= {10,15,20};
        System.out.print(obj.minCostClimb(arr));
    }

}
