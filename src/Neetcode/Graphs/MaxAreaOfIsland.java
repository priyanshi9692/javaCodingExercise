package Neetcode.Graphs;

public class MaxAreaOfIsland {
    public static int maxArea;
    public static int maxArea(int[][] grid){
        int rows = grid.length;
        int cols = grid[0].length;
        maxArea = 0;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(grid[i][j] == 1){
                   maxArea = Math.max(maxArea,traverseIsland(grid, i, j, 1) ) ;
                }
            }
        }
        return maxArea;
    }
    public static int traverseIsland(int[][] grid, int row, int col, int islandArea){
        if(row<0 || row>=grid.length || col<0 || col>= grid[0].length || grid[row][col]!= 1){
            return 0;
        }
        grid[row][col] = -1;
        islandArea = 1+traverseIsland(grid, row+1, col,  islandArea)
                        +traverseIsland(grid, row-1, col, islandArea)
                        +traverseIsland(grid, row, col+1, islandArea)
                        + traverseIsland(grid, row, col-1,  islandArea);
      return islandArea;

    }
    public static void main(String[] args){
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        System.out.println("Maximum area of Island: "+ maxArea(grid));

        int[][] grid1 = {{0,0,0,0,0,0,0,0}};
        System.out.println("Maximum area of Island: "+ maxArea(grid1));

    }
}
