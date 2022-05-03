package Neetcode.Graphs;

import java.util.Arrays;

public class SurroundedRegions {
    public static void surroundedRegions(char[][] board){
        if(board.length == 0 || board == null){
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0; i<rows; i++){
            if(board[i][0] == 'O'){
                scanBoard(board, i, 0);
            }
            if(board[i][cols-1] == 'O'){
                scanBoard(board, i, cols-1);
            }
        }

        for(int j = 0; j<cols; j++){
            if(board[0][j] == 'O'){
                scanBoard(board, 0, j);
            }
            if(board[rows-1][j] == 'O'){
                scanBoard(board, rows-1, j);
            }
        }

        for(int i =0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }else if(board[i][j] == '#'){
                    board[i][j] = 'O';
                }
            }
        }
    }
    public static void scanBoard(char[][] grid, int row, int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]!= 'O'){
            return;
        }

        grid[row][col] = '#';

        scanBoard(grid, row+1, col);
        scanBoard(grid, row-1, col);
        scanBoard(grid, row, col+1);
        scanBoard(grid, row, col-1);

    }

    public static void main(String[] args){
        char[][] board = {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };
        surroundedRegions(board);
        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        System.out.println(Arrays.toString(board[2]));
        System.out.println(Arrays.toString(board[3]));
    }
}
