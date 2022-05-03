package Neetcode.Graphs;

import java.util.*;

public class PacificAndAtlanticBoarder {
    public static int numRows;
    public static int numCols;
    public static int [][] directions = {
            {1,0},
            {0,1},
            {-1,0},
            {0,-1}
    };
    public static int[][] oceanBoundry;
    public static List<List<Integer>> pacificAndAtlantic(int[][] heights){
        numRows = heights.length;
        numCols = heights[0].length;

        oceanBoundry = heights;

        boolean[][] pacificOcean = new boolean[numRows][numCols];
        boolean[][] atlaticOcean = new boolean[numRows][numCols];

        /*
         traverse the pacific ocean and atlantic ocean boundry row wise in order to set it to true
         */
        for(int i = 0; i<numRows; i++){
            traverseTheBoundry(pacificOcean, i, 0);
            traverseTheBoundry(atlaticOcean, i, numCols-1);
        }
        /*
         traverse the pacific ocean and atlantic ocean boundry column wise in order to set it to true
         */
        for(int j = 0; j<numRows; j++){
            traverseTheBoundry(pacificOcean, 0, j);
            traverseTheBoundry(atlaticOcean, numRows-1, j);
        }

        // Iterate over the heights in order to get cell numbers where the water can be mixed
        List<List<Integer>> commonCells = new ArrayList<>();
        for(int i = 0; i<numRows; i++){
            for(int j = 0; j<numCols; j++){
                if(pacificOcean[i][j] && atlaticOcean[i][j]){
                    List<Integer> cells = new ArrayList<>(Arrays.asList(i, j));
                    commonCells.add(cells);
                }
            }
        }
        return commonCells;
    }
    public static void traverseTheBoundry(boolean[][] oceanBound, int row, int col){
        oceanBound[row][col] = true;

        for(int[] dir: directions){
            int nRow = dir[0]+row;
            int nCol = dir[1]+col;

            if(nRow<0 || nRow>= numRows || nCol<0 || nCol>= numCols){
                continue;
            }

            if(oceanBound[nRow][nCol]){
                continue;
            }

            if(oceanBoundry[nRow][nCol]<oceanBoundry[row][col]){
                continue;
            }

            traverseTheBoundry(oceanBound, nRow, nCol);
        }
    }

    public static void main(String[] args){
        int[][] heights = {
                {1,2,2,3,5},
                {3,2,3,4,4},
                {2,4,5,3,1},
                {6,7,1,4,5},
                {5,1,1,2,4}
        };

        System.out.println("Common Cells: "+ pacificAndAtlantic(heights));
    }
}
