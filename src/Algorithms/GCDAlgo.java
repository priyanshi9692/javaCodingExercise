package Algorithms;

public class GCDAlgo {
    public static int gcd(int a, int b){
        while(b!= 0){
            int temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }

    public static void main(String[] args){
        System.out.println("GCD: "+ gcd(20,8));
        System.out.println("GCD: "+ gcd(24,6));
    }
}
