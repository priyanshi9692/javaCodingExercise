package Neetcode.DPProblems;

public class MinimumCostOfClimbing {
    public static int minimumCost(int[] costs){
        int[] reachTop = new int[costs.length+1];

        for(int i = 2; i<reachTop.length; i++){
            int takeOneStep = reachTop[i-1]+costs[i-1];
            int takeTwoSteps = reachTop[i-2]+costs[i-2];

            reachTop[i] = Math.min(takeOneStep, takeTwoSteps);
        }
        return reachTop[costs.length];
    }
    public static void main(String[] args){
        int[] costs = {10,15,20};
        System.out.println("Minimum Cost: "+minimumCost(costs));
    }
}
