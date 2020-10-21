package NumericProblems;
/*
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:

Given input matrix =
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
 */
public class RotateMatrix {
    public void rotateMatrix(int[][] matrix){
        if(matrix==null || matrix.length==1){
            return ;
        }
        int n = matrix.length;
        for(int i =0; i<=n/2; i++){
            for(int j = i; j<n-1-i; j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j]= matrix[j][n-1-i];
                matrix[j][n-1-i]=temp;
            }
        }
    }
    public static void main(String[] args){
        RotateMatrix obj = new RotateMatrix();
        int [][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        } ;
        int n= arr.length;
        obj.rotateMatrix(arr);
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+ "\t");
            }
        }

    }
}
