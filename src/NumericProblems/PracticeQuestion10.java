package NumericProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeQuestion10 {

    public static int addDigits(int num){
        String str = Integer.toString(num);
        int sum = 0;
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            sum = sum + (c-'0');
        }
        if(sum<10){
            return sum;
        }
        return addDigits(sum);
    }

    public static long alternateNumbers(Long num){
        String str = Long.toString(num);
        int k = 0;
        int j = str.length()-1;
        char [] c = new char[str.length()];
        for(int i =0; i<str.length(); i++){
            if(i%2 ==0 ){
                c[i] = str.charAt(k);
                k++;
            }else{
                c[i] = str.charAt(j);
                j--;
            }
        }
        String result = new String(c);

        return Long.parseLong(result);
    }

    public static int arrayPartition(int [] nums){
        if(nums.length%2 != 0 || nums == null){
            return 0;
        }
        Arrays.sort(nums);
        int sum = 0;
        for(int i =0; i<nums.length-1; i+=2){
            sum = sum + Math.min(nums[i], nums[i+1]);
        }
        return sum;
    }

    public static int assignCookie(int [] g, int [] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int gg = 0;
        int ss = 0;
        while(gg<g.length && ss<s.length){
            if(g[gg]<=s[ss]){
                gg++;
                ss++;
            }else{
                ss++;
            }
        }
        return gg;
    }
    public static int binaryObstacle(int[][] grid){
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int result[][] = new int[grid.length][grid[0].length];
        result[0][0] = 1;
        for(int i =1 ; i<grid.length; i++){
            if(grid[i][0] == -1){
                result[i][0] = 0;
            }else{
                result [i][0] = result[i-1][0];
            }
        }
        for(int j =1 ; j<grid[0].length; j++){
            if(grid[0][j] == -1){
                result[0][j] = 0;
            }else{
                result [0][j] = result[0][j-1];
            }
        }
        for(int i =1; i<grid.length; i++){
            for(int j = 1; j<grid[0].length; j++){
                if(grid[i][j] == -1){
                    result[i][j] = 0;
                }else{
                    result[i][j] = result[i-1][j]+result[i][j-1];
                }
            }
        }
        int count = result[result.length-1][result[0].length-1];
        return count;
    }

    public static int binarySearch(int [] nums, int target){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static int brokenCal(int X, int Y){
        int count = 0;
        while(Y>X){
            count++;
            if(Y%2==1){
                Y++;
            }else{
                Y/=2;
            }
        }
        return count + X-Y;
    }

    public static List<List<Integer>> combinationSum(int [] arr, int target){
        if(arr == null || target ==0){
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combos(arr, result, list, 0, 0, target);
        return result;
    }
    public static void combos(int[] arr, List<List<Integer>> result, List<Integer> list, int start, int sum, int target){
        if(sum>target){
            return ;
        }
        if(sum == target){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = start; i<arr.length; i++){
            list.add(arr[i]);
            combos(arr, result, list, i, sum+arr[i], target);
            list.remove(list.size()-1);
        }
    }

    public static int concatenateSum(int [] arr){

        int sum = 0;
        for(int i =0; i<arr.length; i++){
            String str = "";
            for(int j =0; j<arr.length; j++){
                str = Integer.toString(arr[i]) + Integer.toString(arr[j]);
                sum+= Integer.parseInt(str);
            }
        }
        return sum;
    }

    public static int containerWithMostWater(int [] heights){
        int left = 0;
        int right = heights.length-1;
        int max = 0;
        while(left<right){
            max = Math.max(max, (right-left)*Math.min(heights[left], heights[right]));
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }


        }
        return max;
    }

    public static void main(String[] args){
//        System.out.println(addDigits(185));
//        System.out.println(alternateNumbers(1234321L));
//        int [] arr={1,2,3,4,5};
//        System.out.println(arrayPartition(arr));
//        int [] child ={1,2,5,4};
//        int [] size ={1,2,4};
//        System.out.println(assignCookie(child, size));
//        int [][] board ={
//                {0,-1,0,0},
//                {0,-1,0,0},
//                {0,0,0,0},
//                {0,0,-1,0},
//                {0,0,0,0},
//                {-1,0,0,0}
//        };
//        System.out.println(binaryObstacle(board));
//        System.out.println(binarySearch(arr,5));
//        int num=4;
//        int target=6;
//        System.out.println(brokenCal(num,target));

//        int [] arr= {2,3,6,7};
//        int target= 7;
//        System.out.println(combinationSum(arr, target));
//        int [] a= {10,2};

//        System.out.println(concatenateSum(a));
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(arr));
    }
}
