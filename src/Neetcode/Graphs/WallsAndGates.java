package Neetcode.Graphs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {
    public static final int EMPTYCELLS = Integer.MAX_VALUE;
    public static final int GATE = 0;
    public static int[][] directions = {
            {1,0},
            {0,1},
            {-1,0},
            {0,-1}
    };
    public static void wallsAndGates(int[][] rooms){
        int rows = rooms.length;
        int cols = rooms[0].length;

        if(rows == 0){
            return;
        }

        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(rooms[i][j] == GATE){
                    queue.add(new int[]{i, j});
                }
            }
        }

        while(!queue.isEmpty()){
            int[] coordinates = queue.remove();

            for(int[] dir: directions){
                int x = dir[0]+coordinates[0];
                int y = dir[1]+coordinates[1];

                if(x>=0 && x<rows && y>=0 && y<cols && rooms[x][y] == EMPTYCELLS){
                    rooms[x][y]= rooms[coordinates[0]][coordinates[1]]+1;
                    queue.add(new int[]{x, y});
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] rooms = {
                {2147483647,-1,0,2147483647},
                {2147483647,2147483647,2147483647,-1},
                {2147483647,-1,2147483647,-1},
                {0,-1,2147483647,2147483647}
        };

        wallsAndGates(rooms);

        System.out.println(Arrays.toString(rooms[0]));
        System.out.println(Arrays.toString(rooms[1]));
        System.out.println(Arrays.toString(rooms[2]));
        System.out.println(Arrays.toString(rooms[3]));
    }
}
