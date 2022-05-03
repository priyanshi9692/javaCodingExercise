package NumericProblems;

import java.util.HashSet;

public class PBS {
    public static int binarySearch(int [] nums, int target){
//        int index = 0;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
        }
        return -1;
    }
    public static boolean containsDuplicate(int [] m, int k){
       int i = 0;

        HashSet<Integer> hset = new HashSet<>();
        for(int j =0; j<m.length; j++){
            if(!hset.add(m[j])){
                return true;
            }
            if(hset.size()>=k+1){
                hset.remove(m[i++]);
            }


        }
        return false;
    }
    public static int addDigits(int num){
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum + rem;
            num/=10;

        }

        if(sum>9){
           sum =  addDigits(sum);
        }
        return sum;
    }
    public static int addDigit(int num){
        int sum = 0;
        String str = Integer.toString(num);
        for(int i = 0; i< str.length(); i++){

            sum += Character.getNumericValue(str.charAt(i));
        }
        if(sum >9){
            sum = addDigit(sum);
        }
        return sum;
    }
    public static int maxProfit(int [] prices){
        int profit = 0;
        int min = prices[0];
        for(int i = 1; i<prices.length; i++){
            profit = Math.max(profit, prices[i]-min);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
    public static int profit(int[] prices){
        int profit = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }


    public static void main (String[] arg){
        int [] arr = {1,2,3,4};
        System.out.print(addDigit(38));
    }
}
