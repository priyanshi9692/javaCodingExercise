package NumericProblems;

import javax.print.attribute.HashAttributeSet;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

public class PB3 {

    /* Given an integer array nums of 2n integers, group these integers into n pairs
   (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized.
   Return the maximized sum.



    Example 1:

    Input: nums = [1,4,3,2]
    Output: 4
    Explanation: All possible pairings (ignoring the ordering of elements) are:
            1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
            2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
            3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
    So the maximum possible sum is 4.
*/

public static int arrayPartition(int[] nums){
    Arrays.sort(nums);

    int sum = 0;

    for(int i=0; i<nums.length-1; i+=2){
       sum = sum + Math.min(nums[i], nums[i+1]);
    }
    return sum;
}
public static int[] rectangle(int area){

    int [] result = new int[2];
    for(int i= (int)Math.sqrt(area); i>0; i--){
       if(area%i==0){
           result[0] = i;
           result[1] = area/i;
           break;
       }
    }
    return result;
}
public static boolean isomorphicString(String s, String t){

    if(s==null || t == null || s.length()!=t.length()){
        return false;
    }
    char[] s1 = s.toCharArray();
    char[] t1 = t.toCharArray();
    HashMap<Character, Character> hmap = new HashMap<>();
    for(int i =0; i<s1.length; i++){
        if(hmap.containsKey(s1[i])){
            if(hmap.get(s1[i])== t1[i]){
                continue;
            }else{
                return false;
            }
        }if(hmap.containsValue(t1[i])){
           return false;
        }else {
            hmap.put(s1[i],t1[i]);
        }

    }
    return true;
}
public static void rotateImage(int[][] image){
    int n = image.length;
    // Take transpose of the matrix
    for(int i =0; i<image.length; i++){
        for(int  j= i; j<image[0].length; j++){
            int temp = image[j][i];
            image[j][i] = image[i][j];
            image[i][j]=temp;
        }
    }
    // reverse the image
    for(int i = 0; i<image.length; i++){
        for(int j=0; j<n/2; j++){
            int temp = image[i][j];
            image[i][j] = image[i][n-j-1];
            image[i][n-j-1] = temp;
        }
    }
}
/*
On a broken calculator that has a number showing on its display, we can perform two operations:

Double: Multiply the number on the display by 2, or;
Decrement: Subtract 1 from the number on the display.
Initially, the calculator is displaying the number X.

Return the minimum number of operations needed to display the number Y.



Example 1:

Input: X = 2, Y = 3
Output: 2
Explanation: Use double operation and then decrement operation {2 -> 4 -> 3}.
 */
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
    return count+X-Y;

//    while(X<Y){
//        X=X*2;
//        count++;
//    }
//    if(X==Y){
//        return count;
//    } else{
//        count+=X-Y;
//    }
//return count;

}
public static boolean isValidParenthese(String str){
    // ()
    if(str.length()%2 != 0){
        return false;
    }
    Stack<Character> stack =  new Stack<>();
    for(char c: str.toCharArray()){
        if(c=='(' || c=='{' || c== '['){
            stack.push(c);
        }else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
            stack.pop();
        }
        else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
            stack.pop();
        }
        else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
            stack.pop();
        }else{
            return false;
        }
    }
        return stack.isEmpty();
}

public static int uniquePath(int[][] grid){
    if(grid==null || grid.length==0 || grid[0].length==0){
        return 0;
    }

    //[[0,0,0],
    // [0,1,0],
    // [0,0,0]]
    int [][] result = new int[grid.length][grid[0].length];
    int count = 0;
    result[0][0] = 1;
    for(int i =1; i<grid.length; i++){
        if(grid[i][0]==1){
            result[i][0] = 0;
        }else{
            result[i][0] = result[i-1][0];
        }
    }
    for(int j=1; j<grid[0].length; j++){
        if(grid[0][j]==1){
            result[0][j] = 0;
        }else{
            result[0][j] = result[0][j-1];
        }
    }
    for(int i =1; i<grid.length; i++){
        for(int j =1; j<grid[0].length; j++){
            if(grid[i][j]==1){
                result[i][j] = 0;
            }else{
                result[i][j] = result[i][j-1]+result[i-1][j];
            }
        }
    }
    count = result[grid.length-1][grid[0].length-1];
    return count;
}
// "abcabcdefgh"

public static int longestSubstringWithoutRepeating(String str){
    int len =0;
    char [] c_arr = str.toCharArray();
    int a = 0;
    int b = 0;
    HashSet<Character> hset = new HashSet<>();
    while(b<str.length()){
        if(!hset.contains(c_arr[b])){
            hset.add(c_arr[b]);
            b++;
            len = Math.max(len, hset.size());
        }else{
            hset.remove(c_arr[a]);
            a++;
        }
    }
    return len;

}
public static boolean isAnagram(String s, String t){
    s = s.toLowerCase();
    System.out.println(s);

    t= t.toLowerCase();
    System.out.println(t);
    char [] s_arr = s.toCharArray();
    char [] t_arr = t.toCharArray();
    Arrays.sort(s_arr);
    Arrays.sort(t_arr);
    String str1= new String(s_arr);
    String str2 = new String(t_arr);
    System.out.println(str1);
    System.out.println(str2);
    if(str1.equals(str2)){
        return true;
    }

    return false;
}
    public static void main (String[] arg){
    int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println(brokenCal(2,7));
    System.out.println(isValidParenthese("{[()]}"));
        System.out.println(longestSubstringWithoutRepeating("abcabcdefgh"));
        System.out.println(isAnagram("Hello", "lloeh"));

}
}
