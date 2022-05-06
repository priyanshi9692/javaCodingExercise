package Visa;

public class ReverseInteger {
    public static int reverseInteger(int num){
        int reverseNum = 0;
        while(num>0){
            int rem = num%10;
            reverseNum = reverseNum*10 + rem;
            num/=10;
        }
        return reverseNum;
    }

    public static void main(String[] args){
        System.out.println("Reverse Number: "+ reverseInteger(123));
    }
}
