package Neetcode.Graphs;

public class NumberOfIsland {
    public static int numberOfIsland(char[][] grid){
        if(grid.length == 0 || grid == null){
            return 0;
        }

        int count = 0;

        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    trackIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void trackIsland(char[][] grid, int row, int col){
        if(row<0 || row>= grid.length || col<0 || col>=grid[0].length || grid[row][col]!= '1'){
            return;
        }

        grid[row][col] = '#';
        trackIsland(grid, row+1, col);
        trackIsland(grid, row-1, col);
        trackIsland(grid, row, col+1);
        trackIsland(grid, row, col-1);
    }

    public static void main(String[] args){
        char[][] board = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        System.out.println("Number of Islands: "+ numberOfIsland(board));
    }
}
