package Facebook.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BuildingView {
    public static int[] buildingView(int[] heights){
        int n = heights.length;

        Stack<Integer> stack = new Stack<>();

        List<Integer> list = new ArrayList<>();

        for(int i = n-1; i>=0; i--){
            while(!stack.isEmpty() && heights[stack.peek()]<heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                list.add(i);
            }

            stack.push(i);
        }

        int[] result = new int[list.size()];

        for(int i = 0; i<result.length; i++){
            result[i] = list.get(list.size()-1-i);
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Building view: "+ Arrays.toString(buildingView(new int[]{4,2,3,1})));
        System.out.println("Building view: "+ Arrays.toString(buildingView(new int[]{4,3,2,1})));
        System.out.println("Building view: "+ Arrays.toString(buildingView(new int[]{1,3,2,4})));
    }
}
