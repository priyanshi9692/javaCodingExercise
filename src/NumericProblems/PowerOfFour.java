package NumericProblems;

public class PowerOfFour {
    public boolean isPowerOfFour(int num){
        if(num==0){
            return false;
        }
            int pow= (int)(Math.log(num)/Math.log(4));
            if(num==Math.pow(4,pow)){
                return true;
            }

        return false;
    }
    public static void main(String [] args){
        PowerOfFour obj= new PowerOfFour();
        System.out.println(obj.isPowerOfFour(24));
    }
}
