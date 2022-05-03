package Neetcode.DPProblems;

public class CoinChange {
    public static int [][] memo;
    public static int coinChange(int[] coins, int amount){
        memo = new int[coins.length][amount+1];
        int count = countOfCoins(coins, amount, 0);
        return count!= Integer.MAX_VALUE ? count : -1;
    }
    public static int countOfCoins(int[] coins, int amount, int index){
        if(amount == 0){
            return 0;
        }
        if(amount<0 || index == coins.length){
            return Integer.MAX_VALUE;
        }

        if(memo[index][amount] == 0){
            int notSelect = countOfCoins(coins, amount, index+1);
            int select = countOfCoins(coins, amount-coins[index], index);

            if(select!= Integer.MAX_VALUE){
                select+=1;
            }
            memo[index][amount] = Math.min(select, notSelect);
        }
        return memo[index][amount];
    }
    public static void main(String[] args){
        System.out.println("Minimum number of coins required to make the amount: "+ coinChange(
                new int[]{1,5,6,8}, 11
        ));
        System.out.println("Minimum number of coins required to make the amount: "+ coinChange(
                new int[]{1,2,5}, 11
        ));
    }
}
