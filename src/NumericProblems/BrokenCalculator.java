package NumericProblems;
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

public class BrokenCalculator {
    public int calculateOperations(int num, int target){
        int min= Integer.MAX_VALUE;
        int count;
        for(int i= num; i>0; i--){
            count =num-i;
            int var=i;
            while(target>var){
                count++;
                var = var*2;
                if(var==target){
                break;
                }
            }
            count = count+(var-target);
            min = min>count ? count :min;
        }

        return min;
    }
    public int calBroke(int X, int Y){
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
    }
    public static void main(String [] args){
        BrokenCalculator obj =new BrokenCalculator();
        int num=4;
        int target=6;
//        System.out.println(obj.calculateOperations(num,target));
        System.out.println(obj.calBroke(num,target));
    }
}
