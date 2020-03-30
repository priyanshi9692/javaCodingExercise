package NumericProblems;

public class PaintTheMatrix {
    public void paintedMatrix( int color, int x, int y){

        if(board==null){
            return;
        }
        int m=board.length;
        int n=board[0].length;
        int val=board[x][y];
        paintSurroundings(x, y,  val, color);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public void paintSurroundings(int x, int y, int val, int color){
       if(x<0 || x>board.length-1 || y<0 || y>board[0].length-1 || board[x][y]!=val){
           return;
       }
        board[x][y]=color;
        paintSurroundings(x+1, y,  val, color);
        paintSurroundings(x-1, y,  val, color);
        paintSurroundings(x, y+1,  val, color);
        paintSurroundings(x, y-1,  val, color);
    }

    static int[][] board = {
            {1,1,1,1,1,1},
            {0,1,0,2,1,0},
            {3,2,3,1,2,3},
            {4,5,5,6,6,6},
            {7,7,7,7,7,7}
    };
    public static void main(String [] args){
        PaintTheMatrix obj = new PaintTheMatrix();
      obj.paintedMatrix(3, 0,2);
    }
}
