package NumericProblems;

public class NumberOfIslands {
    public int numberOfIslands(int[][] earth){
        int count=0;
        if(earth==null || earth.length==0 || earth[0].length==0){
            return 0;
        }
        int col = earth[0].length;
        int row = earth.length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(earth[i][j]==1){
                    count++;
                    trackIslands(i, j, earth);
                }
            }
        }
        return count;
    }
    public void trackIslands(int i, int j, int[][] earth){
        int col = earth[0].length-1;
        int row = earth.length-1;
        if(i<0 || i>row || j<0 || j>col|| earth[i][j]!=1){
            return;
        }
        earth[i][j]=-1;
        trackIslands(i+1, j, earth);
        trackIslands(i-1, j, earth);
        trackIslands(i, j+1, earth);
        trackIslands(i, j-1, earth);
    }
    public static void main(String [] args){
        NumberOfIslands obj =new NumberOfIslands();
        int[][] matrix = {
                {1,1,0},
                {1,0,1},
                {0,1,1},
        };
        System.out.println(obj.numberOfIslands(matrix));
    }
}
