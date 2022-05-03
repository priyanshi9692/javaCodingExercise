package MicrosoftOA;

import TreeTraversal.SymmetryTrees;

public class CoinChange {
    private static int[][] memo;
    public static int coinChange(int[] coins, int amount){
        memo = new int[coins.length][amount+1];
        int ans = coinChangeRecurse(coins, 0, amount);
        return ans!= Integer.MAX_VALUE ? ans: -1;
    }

    public static int coinChangeRecurse(int[] coins, int index, int amount){
        if(amount == 0){
            return 0;
        }
        if(index == coins.length || amount <0){
            return Integer.MAX_VALUE;
        }
        if(memo[index][amount] == 0){
            int noChose = coinChangeRecurse(coins, index+1, amount);
            int chose = coinChangeRecurse(coins, index, amount-coins[index]);
            if(chose!= Integer.MAX_VALUE){
                chose+=1;
            }
            memo[index][amount] = Math.min(noChose, chose);
        }
        return memo[index][amount];
    }
    public static void main(String[] args){
        int[] coins = {1,2,5};
        System.out.println(coinChange(coins, 11));
    }
}
