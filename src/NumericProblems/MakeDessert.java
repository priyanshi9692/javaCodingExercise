package NumericProblems;
/*
You would like to make dessert and are preparing to buy the ingredients.
You have n ice cream base flavors and m types of toppings to choose from. You must follow these rules when making your dessert:

There must be exactly one ice cream base.
You can add one or more types of topping or have no toppings at all.
There are at most two of each type of topping.
You are given three inputs:

baseCosts, an integer array of length n, where each baseCosts[i] represents the price of the ith ice cream base flavor.
toppingCosts, an integer array of length m, where each toppingCosts[i] is the price of one of the ith topping.
target, an integer representing your target price for dessert.
You want to make a dessert with a total cost as close to target as possible.

Return the closest possible cost of the dessert to target. If there are multiple, return the lower one.
 */

/*
Input: baseCosts = [1,7], toppingCosts = [3,4], target = 10
Output: 10
Explanation: Consider the following combination (all 0-indexed):
- Choose base 1: cost 7
- Take 1 of topping 0: cost 1 x 3 = 3
- Take 0 of topping 1: cost 0 x 4 = 0
Total: 7 + 3 + 0 = 10.
 */
public class MakeDessert {
    public int result = 0;
    public  int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        result = baseCosts[0];
        for(int base: baseCosts){
            closestSum(base, toppingCosts, 0, target);
        }
        return result;
    }

    public  void closestSum(int current, int[] toppings, int i, int target){
        if(Math.abs(target-current) < Math.abs(target-result)
                || Math.abs(target - current) == Math.abs(target - result)
                && current < result){
            result = current;
        }
        if(i == toppings.length){
            return;
        }
        closestSum(current, toppings, i+1, target);
        closestSum(current+toppings[i], toppings, i+1, target);
        closestSum(current+toppings[i]*2, toppings, i+1, target);
    }
    public static void main(String[] args){
        MakeDessert obj = new MakeDessert();
        int [] base = {3,10};
        int[] toppings = {2,5};
        int target = 9;

        System.out.println(obj.closestCost(base,toppings,target));
    }
}
