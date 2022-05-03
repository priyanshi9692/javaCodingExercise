package GooglePhoneScreen.Trees;

public class LongestIncreasingPathInMatrix {
    public static int[][] directions = {
            {0,1},
            {1,0},
            {-1,0},
            {0,-1}
    };
    public static int longestIncreasingPath(int[][] matrix){
        int longestPath = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] memo = new int[rows][cols];

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                longestPath = Math.max(longestPath, depthFirstSearchOnMatrix(matrix, i, j, memo));
            }
        }
        return longestPath;
    }

    public static int depthFirstSearchOnMatrix(int[][] matrix, int row, int col, int[][] memo){
        if(memo[row][col]!= 0){
            return memo[row][col];
        }

        for(int[] dir: directions){
            int x = dir[0]+row;
            int y = dir[1]+col;

            if(x>=0 && x<matrix.length && y>=0 && y<matrix[0].length && matrix[row][col]<matrix[x][y]){
                memo[row][col] = Math.max(memo[row][col], depthFirstSearchOnMatrix(matrix, x, y, memo));
            }
        }
        return ++memo[row][col];
    }

    public static void main(String[] args){
        int[][] matrix = {
                {9,9,4},
                {6,6,8},
                {2,1,1}
        };

        System.out.println("Longest increasing Path: "+longestIncreasingPath(matrix));
    }
}
