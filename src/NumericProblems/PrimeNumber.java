package NumericProblems;


public class PrimeNumber {
    public boolean isPrimeNumber(int num){

        int i=2;
        while(i<=num/2){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args){
        PrimeNumber num=new PrimeNumber();
        System.out.println(num.isPrimeNumber(4));
    }
}
