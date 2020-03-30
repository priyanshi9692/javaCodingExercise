package NumericProblems;

public class BinaryObstacle {
    public int binaryObstacle(int [][] board){
        if(board.length==0 || board[0].length==0 || board==null){
            return 0;
        }
        int [][] result = new int[board.length][board[0].length];
        int count=0;
        result[0][0]=  1;
        for(int i=1; i<board.length; i++){
            if(board[i][0]==-1){
                result[i][0]=0;
            }
            else{
                result[i][0]=result[i-1][0];
            }
        }
        for(int j=1; j<board[0].length;j++){
            if(board[0][j]==-1){
                result[0][j]=0;
            }
            else{
                result[0][j]=result[0][j-1];
            }
        }
        for(int i=1; i<board.length; i++){
            for(int j=1; j<board[0].length; j++){
                if(board[i][j]==-1){
                    result[i][j]=0;
                }
                else{
                    result[i][j]=result[i-1][j]+result[i][j-1];
                }

            }
        }
        count=result[board.length-1][board[0].length-1];
        return count;
    }
    public static void main(String [] args){
        BinaryObstacle obj =new BinaryObstacle();
        int [][] board ={
                {0,-1,0,0},
                {0,-1,0,0},
                {0,0,0,0},
                {0,0,-1,0},
                {0,0,0,0},
                {-1,0,0,0}
        };
        System.out.println(obj.binaryObstacle(board));
    }
}
