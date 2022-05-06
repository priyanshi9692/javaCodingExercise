package Visa;

public class BestBuyAndSellTime {
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else if(prices[i]-minPrice > maxProfit){
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        System.out.println("Maximum Profit: "+ maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
