package Neetcode.TwoDimDPProblems;

public class UniquePaths {
    public static int uniquePaths(int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }
        int path = 0;
        int[][] dp = new int[n][m];
        for(int i = 0; i<n; i++){
            dp[i][0] = 1;
        }

        for(int j = 0; j<m; j++){
            dp[0][j] = 1;
        }

        for(int i = 1; i<n; i++){
            for(int j = 1; j<m; j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        path = dp[n-1][m-1];
        return path;
    }
    public static void main(String[] args){
        System.out.println("Unique paths: "+uniquePaths(3,7));
    }
}
