package NumericProblems;

public class MinimumPathSum {
    public int minimumPathSum(int [][] board){
        if(board==null || board.length==0 || board[0].length==0 ){
            return 0;
        }
        int [][] result = new int[board.length][board[0].length];
        result[0][0]=board[0][0];
        for(int j=1; j<board[0].length; j++){
            result[0][j]= result[0][j-1]+board[0][j];
        }
        for(int i=1; i<board.length; i++){
            result[i][0]=result[i-1][0]+board[i][0];
        }
        for(int i=1; i<board.length; i++){
            for(int j=1; j<board[0].length; j++){
                if(result[i-1][j]>result[i][j-1]){
                    result[i][j] = result[i][j-1] + board[i][j];
                }
                else{
                    result[i][j] = result[i-1][j] + board[i][j];
                }
            }
        }
        return result[board.length-1][board[0].length-1];

    }
    public static void main(String [] args){
        MinimumPathSum obj =new MinimumPathSum();
        int [][] board ={
                {2,3,4,1},
                {2,1,4,5},
                {4,5,6,7}
        };
        System.out.println(obj.minimumPathSum(board));
    }
}
