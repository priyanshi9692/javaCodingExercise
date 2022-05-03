package Neetcode.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static int[][] directions = {
            {1,0},
            {0,1},
            {0,-1},
            {-1,0}
    };
    public static final int ROTTEN = 2, FRESH =1,  EMPTY = 0;
    public static int rottingOranges(int[][] oranges){
         int n = oranges.length;
         int m = oranges[0].length;
         Queue<int[]> queue = new LinkedList<>();
         int fresh = 0;

         for(int i = 0; i<n; i++){
             for(int j = 0; j<m; j++){
                 if(oranges[i][j] == ROTTEN){
                     queue.add(new int[]{i, j});
                 }else if (oranges[i][j] == FRESH){
                     fresh++;
                 }
             }
         }
         int timeTaken = 0;

         while(!queue.isEmpty()){
             Queue<int[]> nextQueue = new LinkedList<>();

             while(!queue.isEmpty()){
                 int[] coordinates = queue.remove();

                 for(int [] dir: directions){
                     int row = coordinates[0]+dir[0];
                     int col = coordinates[1]+dir[1];

                     if(row>=0 && col>=0 && row<oranges.length && col<oranges[0].length && oranges[row][col] == FRESH){
                         oranges[row][col] = ROTTEN;
                         fresh--;
                         nextQueue.add(new int[]{row, col});
                     }
                 }
             }
             queue = nextQueue;
             if(!nextQueue.isEmpty()){
                 timeTaken++;
             }

         }

         return fresh>0 ? -1 : timeTaken;
    }
    public static void main(String[] args){
        int[][] garden = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };

        System.out.println("Time taken to rotten the fresh oranges: "+ rottingOranges(garden));
    }
}
