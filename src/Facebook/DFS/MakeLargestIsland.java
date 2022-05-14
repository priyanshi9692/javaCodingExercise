package Facebook.DFS;

import javax.print.attribute.IntegerSyntax;
import java.util.HashMap;
import java.util.HashSet;

public class MakeLargestIsland {
    private static HashMap<Integer, Integer> map;
    private static final int[][] dirs = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1},
    };
    private static int id;
    public static int largestIsland(int[][] grid) {
        id = 2;
        int rows = grid.length;
        int cols = grid[0].length;

        map = new HashMap<>();
        int maxCount = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 1) {
                    int size = markIsland(grid, i, j, id);

                    map.put(id, size);
                    maxCount = Math.max(maxCount, size);

                    id += 1;
                }
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 0) {
                    maxCount = Math.max(maxCount, countIslands(grid, i, j) + 1);
                }
            }
        }

        return maxCount;
    }

    private static int countIslands(int[][] grid, int row, int col) {
        HashSet<Integer> visited = new HashSet<>();
        int count = 0;
        for(int[] dir : dirs) {
            int x = row + dir[0];
            int y = col + dir[1];

            if(inBound(grid, x, y) && grid[x][y] > 1 && visited.add(grid[x][y])) {
                count += map.get(grid[x][y]);
            }
        }

        return count;
    }

    private static int markIsland(int[][] grid, int row, int col, int id) {
        if(!inBound(grid, row, col) || grid[row][col] != 1) {
            return 0;
        }

        grid[row][col] = id;

        return 1 +
                markIsland(grid, row + 1, col, id) +
                markIsland(grid, row - 1, col, id) +
                markIsland(grid, row , col + 1, id) +
                markIsland(grid, row, col - 1, id);
    }

    private static boolean inBound(int[][] grid, int row, int col) {
        return row >= 0 && col >= 0 && row < grid.length && col< grid[0].length;
    }

    public static void main(String[] args){
        int[][] grid = {
                {1,0},
                {0,1}
        };

        System.out.println("Making A Large Island: "+largestIsland(grid));
    }
}
