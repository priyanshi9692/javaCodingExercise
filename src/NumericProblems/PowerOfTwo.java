package NumericProblems;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int num){
        if(num==0){
            return false;
        }
            int pow = (int)(Math.log(num)/Math.log(2));
            if(num == Math.pow(2, pow)){
                return true;
            }
        return false;
    }
    public static void main(String [] args){
        PowerOfTwo obj= new PowerOfTwo();
        System.out.println(obj.isPowerOfTwo(20));
    }
}
