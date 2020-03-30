package NumericProblems;

public class PerimeterofIsland {
    public int perimeterOfIsland(int[][] grid){
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        int perimeter=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    perimeter += countEdges(grid, i, j);
                }

            }
        }
        return perimeter;
    }
    public int countEdges(int[][] grid, int i, int j){
        return helper(grid, i + 1, j) + helper(grid, i, j + 1)
                + helper(grid, i, j - 1) + helper(grid, i- 1, j);
    }
    public int helper(int[][] grid, int i, int j){
        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]==0){
            return 1;
        }
        if(i == -1 || i == grid.length || j == -1 || j == grid[0].length){
            return 1;
        }
        return 0;
    }




    public static void main(String [] args) {
        PerimeterofIsland obj = new PerimeterofIsland();
        int[][] island = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        System.out.println(obj.perimeterOfIsland(island));
    }
}
