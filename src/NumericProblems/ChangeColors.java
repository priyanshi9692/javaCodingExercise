package NumericProblems;

public class ChangeColors {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i =0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    trackIsland(grid, i, j);
                }
            }
        }
        return count;

    }
    public void trackIsland(char[][] grid, int i, int j){
        if(i<0 || i>grid.length-1 || j<0 || j>grid[0].length-1 || grid[i][j]!='1'){
            return ;
        }

        grid[i][j] = 'X';
        trackIsland(grid, i+1,j);
        trackIsland(grid, i-1,j);
        trackIsland(grid, i,j+1);
        trackIsland(grid, i,j-1);
    }

}
