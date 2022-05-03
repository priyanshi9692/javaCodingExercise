package Neetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static List<List<String>> result;
    public static boolean board[][];
    public static List<List<String>> nQueens(int n){
        result = new ArrayList<>();
        board = new boolean[n][n];
        solveQueue(board, 0);
        return result;
    }

    public static void solveQueue(boolean[][] board, int row){
        if(row == board.length){
            List<String> queensPlacement = new ArrayList<>();
            for(int i = 0; i<board.length; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j<board[0].length; j++){
                   if(board[i][j]){
                       sb.append('Q');
                   }else{
                       sb.append('.');
                   }
                }
                queensPlacement.add(sb.toString());
            }
            result.add(queensPlacement);
            return;
        }

        for(int col = 0; col<board.length; col++){
            if(isSafePlace(board, row, col)){
                board[row][col] = true;
                solveQueue(board, row+1);
                board[row][col] = false;
            }
        }
    }

    public static boolean isSafePlace(boolean[][] board, int row, int col){
        return isSafeCol(board, row, col) && isSafeDiagonal(board, row, col) && isSafeAntiDiag(board, row, col);
    }

    public static boolean isSafeCol(boolean[][] board, int row, int col){
        for(int i = row; i>=0; i--){
            if(board[i][col]){
                return false;
            }
        }
        return true;
    }

    public static boolean isSafeDiagonal(boolean[][] board, int row, int col){
        int i = row-1;
        int j = col-1;

        while(i>=0 && j>=0){
            if(board[i][j]){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }

    public static boolean isSafeAntiDiag(boolean[][] board, int row, int col){
        int i = row-1;
        int j = col+1;

        while(i>=0 && j<board[0].length){
            if(board[i][j]){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("N Queens Solution: "+ nQueens(4));
    }
}
