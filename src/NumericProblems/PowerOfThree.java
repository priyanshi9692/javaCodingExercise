package NumericProblems;

public class PowerOfThree {
    public boolean isPowerOfThree(int num){
        if(num==0){
            return false;
        }
        return num==Math.pow(3,Math.round(Math.log(num)/Math.log(3)));
    }
}
