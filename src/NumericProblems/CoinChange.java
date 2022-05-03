package NumericProblems;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if(amount==0){
            return 0;
        }
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0; i<=amount; i++){
            if(dp[i]==Integer.MAX_VALUE){
                continue;
            }
            for(int coin: coins){
                if(i<=amount-coin){ //handle case when coin is Integer.MAX_VALUE
                    dp[i+coin] = Math.min(dp[i]+1, dp[i+coin]);
                }
            }
        }
        if(dp[amount]==Integer.MAX_VALUE){
            return -1;
        }
        return dp[amount];
    }
}
