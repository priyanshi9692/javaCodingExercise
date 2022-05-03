package GooglePhoneScreen.Trees;

public class NumberOfIslands {
    public static int numberOfIslands(char[][] grid){
        int count = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(grid[i][j] == '1'){
                    trackIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void trackIsland(char[][] grid, int row, int col){
        if(row<0 || row>=grid.length || col<0 || col>= grid[0].length || grid[row][col]!= '1'){
            return;
        }

        grid[row][col] = '#';

        trackIsland(grid, row+1, col);
        trackIsland(grid, row-1, col);
        trackIsland(grid, row, col+1);
        trackIsland(grid, row, col-1);
    }

    public static void main(String[] args){
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        System.out.println("Number of Islands: "+ numberOfIslands(grid));
    }
}
