package NumericProblems;
// Can not sell stock before buy one
public class BuyAndSellStock {
    public int maxProfit(int [] prices){
        if(prices== null || prices.length==0){
            return 0;
        }
        int min= prices[0];
        int result=0;
        for(int i=1; i<prices.length; i++ ){
            result= Math.max(result, prices[i]-min);
            min= Math.min(min, prices[i]);
        }
        return result;
    }
    public static void main(String[] args){
        BuyAndSellStock obj= new BuyAndSellStock();
        int [] arr={7,1,5,3,6,4};
        System.out.println(obj.maxProfit(arr));
    }
}
