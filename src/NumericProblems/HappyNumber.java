package NumericProblems;

import java.util.HashSet;

public class HappyNumber {
    public boolean happyNumber(int num){
        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(num)){
            set.add(num);
            num=getSum(num);
            if(num==1){
                return true;
            }
        }
        return false;
    }
    public int getSum(int num){
        int sum =0;
        while(num>0) {
            sum+=(num%10)*(num%10);
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        HappyNumber obj = new HappyNumber();
        System.out.println(obj.happyNumber(19));
    }
}
