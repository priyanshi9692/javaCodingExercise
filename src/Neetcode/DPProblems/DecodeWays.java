package Neetcode.DPProblems;

import java.util.HashMap;

public class DecodeWays {
    public static HashMap<Integer, Integer> memo;
    public static int numDecoding(String num){
        memo = new HashMap<>();
        return memoizationDecoding(num, 0);
    }
    public static int memoizationDecoding(String num, int index){
        // Base Condition
        if(memo.containsKey(index)){
            return memo.get(index);
        }
        // if the index becomes equal to the string length then exit with one
        if(index == num.length()){
            return 1;
        }
        // if the starting character is 0 then we honestly can not make any character with that
        if(num.charAt(index) == '0'){
            return 0;
        }

//        // if the starting character is zero than there have to be one another condition to check for index
        if(index == num.length()-1){
            return 1;
        }

        int ans = memoizationDecoding(num, index+1);
        if(Integer.parseInt(num.substring(index, index+2))<=26){
            ans+= memoizationDecoding(num, index+2);
        }
        memo.put(index, ans);

        return ans;
    }
    public static void main(String[] args){
        System.out.println("Decoded String: "+ numDecoding("12"));
    }
}
