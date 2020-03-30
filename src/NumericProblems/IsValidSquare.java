package NumericProblems;

public class IsValidSquare {
    //using binary search
    public boolean isValidSquare(int num){
        if(num==0 || num==1){
            return true;
        }
        if(num<0){
            return false;
        }
        long left=1;
        long right=num;
        while(left+1<right){
            long mid = left + (right-left)/2;
            long product =mid*mid;
            if(product>(long)num){
                right=mid;
            }else if(product < (long) num){
                left = mid;
            }else{
                return true;
            }
        }
        if(left*left == (long)num || (right*right) == (long)num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        IsValidSquare obj = new IsValidSquare();
        System.out.println(obj.isValidSquare(20));
    }
}
