package MicrosoftOA;

import java.util.Stack;

/*
1. Making histograms of every row and calculating area of each of the histogram
2. Using stack to find out left and right expansion of an element
3. Calculating width using left and right heights
4. Calculating area and returning max area
 */
public class MaximalRectangle {

    public static int maxArea(char[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 0 && cols == 0){
            return 0;
        }
        int area = 0;
        int[] heights = new int[cols];

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(matrix[i][j] == '0'){
                    heights[j] = 0;
                }else{
                    heights[j]+=1;
                }
            }
            area = Math.max(area, maxAreaOfHistogram(heights));
        }
        return area;
    }
    public static int maxAreaOfHistogram(int[] heights){
        int []left = new int[heights.length];
        int[] right = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        int area = 0;
        for(int i = 0; i<heights.length; i++){

            while(!stack.isEmpty() && heights[i]<= heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                left[i] = -1;
            }else{
                left[i] = stack.peek();
            }
            stack.add(i);
        }
        stack.clear();

        for(int i = heights.length-1; i>=0; i--){
            while(!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                right[i] = heights.length;
            }else{
                right[i] = stack.peek();
            }
            stack.add(i);
        }

        int width = 0;

        for(int i = 0; i<heights.length; i++){
            width = right[i]-left[i]-1;
            area = Math.max(area, width*heights[i]);
        }
        return area;
    }

    public static void main(String[] args){
        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};

        System.out.println("Maximum area of binary matrix: "+ maxArea(matrix));
    }
}
