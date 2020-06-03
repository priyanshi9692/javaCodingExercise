package NumericProblems;
// LeetCode 200. Number of Islands
public class CountOfIslands {
    public int countIsland(char[][] grid){
        if(grid == null || grid.length == 0 || grid[0].length ==0){
            return 0;
        }
        int count = 0;
        for(int i = 0 ; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j]=='1'){
                    count+=1;
                    trackIslands(grid, i, j);
                }
            }
        }
        return count;
    }
    public void trackIslands(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]!='1'){
            return ;
        }
        grid[i][j] = 'X';
        trackIslands(grid, i+1, j);
        trackIslands(grid, i-1, j);
        trackIslands(grid, i, j+1);
        trackIslands(grid, i, j-1);
    }
    public static void main(String[] args){
        CountOfIslands obj = new CountOfIslands();
        char[][] grid = {
                {'1','1','0'},
                {'1','1','1'},
                {'0','1','1'}
        };
        System.out.println(obj.countIsland(grid));
    }
}
