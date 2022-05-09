package Visa;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class MaximalSquare {
    public static int maximulSquare(char[][] board){
        if(board.length == 0 || board == null){
            return 0;
        }
        int[][] dp = new int[board.length][board[0].length];
        int result = 0;
        int rows = board.length;
        int cols = board[0].length;

        // converting the character array into integer array

        for(int i = 0; i<rows; i++){
            dp[i][0] = board[i][0]-'0';
            result = Math.max(result, dp[i][0]);
        }
        for(int j = 0; j<cols; j++){
            dp[0][j] = board[0][j]-'0';
            result = Math.max(result, dp[0][j]);
        }

        for(int i = 1; i<rows; i++){
            for(int j = 1; j<cols; j++){
                if(board[i][j] == '1'){
                    int min = Math.min(dp[i-1][j], dp[i][j-1]);
                    min = Math.min(dp[i-1][j-1], min);
                    dp[i][j] = min+1;

                    result = Math.max(dp[i][j], result);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return result*result;
    }

    public static void main(String[] args){
        char[][] board = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };

        System.out.println("Maximal Square: "+ maximulSquare(board));
    }
}
