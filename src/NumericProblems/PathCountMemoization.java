package NumericProblems;

public class PathCountMemoization {
    public int pathCountMemoization(int[][] board){
        if(board.length==0 || board[0].length==0){
            return 0;
        }
        for(int i=0; i<board.length; i++){
            board[i][0]=1;
        }
        for(int j=0; j<board[0].length; j++){
            board[0][j]=1;
        }
        for(int i=1; i<board.length; i++){
            for(int j=1; j<board[0].length; j++){
                board[i][j]=board[i-1][j]+board[i][j-1];
            }
        }
        int count=board[board.length-1][board[0].length-1];
        return count;
    }
    public static void main(String [] args){
        PathCountMemoization obj = new PathCountMemoization();
        int [][] board ={
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };
        System.out.println(obj.pathCountMemoization(board));
    }
}
