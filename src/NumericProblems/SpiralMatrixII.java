package NumericProblems;
/*
59. Spiral Matrix II
Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

Example:

Input: 3
Output:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
 */
public class SpiralMatrixII {
    public int[][] spiralMatrix(int n){
        int [][] result = new int[n][n];
        int rowB= 0;
        int rowE = n-1;
        int columnB = 0;
        int columnE = n-1;
        int count = 1;
        while(rowB<=rowE && columnB<=columnE){
            for(int i =columnB; i<=columnE; i++ ){
                result[rowB][i] = count++;
            }
            rowB++;
            for(int i = rowB; i<=rowE; i++){
                result[i][columnE] = count++;
            }
            columnE--;

            if(rowB<=rowE){
                for(int i = columnE; i>=columnB; i--){
                    result[rowE][i] = count++;
                }
            }
            rowE--;

            if(columnB<=columnE){
                for(int i = rowE; i>=rowB; i--) {
                    result[i][columnB] = count++;
                }
            }
            columnB++;
        }
        return result;
    }
    public static void main(String[] args){
        SpiralMatrixII obj = new SpiralMatrixII();
        int[][] result = obj.spiralMatrix(3);
        for(int i =0; i<result.length; i++){
            System.out.print("[");
            for(int j=0; j<result[0].length; j++){
                System.out.print("\t"+result[i][j]+","+"\t");
            }
            System.out.print("]");
        }
    }

}
