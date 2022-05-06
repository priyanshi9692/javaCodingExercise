package Neetcode.Graphs;

import java.util.*;

public class ShortestPathInTheGridWithObstacleElimination {
    public static int [][] directions = {
            {1,0},
            {0,1},
            {-1,0},
            {0,-1}
    };
    public static int shortestPath(int[][] grid, int k){
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] visited = new int[rows][cols];

        for(int i =0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                visited[i][j] = -1;
            }
        }

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{0,0,k,0});

        while(!queue.isEmpty()){
            int[] currPos = queue.remove();

            int x = currPos[0];
            int y = currPos[1];
            int obstacle = currPos[2];
            int moves = currPos[3];

            if(x == rows-1 && y == cols-1){
                return moves;
            }

            if(grid[x][y] == 1){
                obstacle--;
            }

            for(int[] dir: directions){
                int dx = x+dir[0];
                int dy = y+dir[1];

                if(dx>=0 && dx<rows && dy>=0 && dy<cols && visited[dx][dy]<obstacle){
                    visited[dx][dy] = obstacle;
                    queue.add(new int[]{dx, dy, obstacle, moves+1});
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[][] grid = {
                {0,0,0},
                {1,1,0},
                {0,0,0},
                {0,1,1},
                {0,0,0}
        };

        System.out.println("Shortest Path: "+ shortestPath(grid, 1));
    }
}
