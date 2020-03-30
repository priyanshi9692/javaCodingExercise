package NumericProblems;
/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.
 */

public class HammingDistance {
    public int hammingDistance(int x, int y){
        int xor =x^y;
        int count =0;
        while(xor>0){
            if((xor&1) == 1){
                count ++;
            }
            xor = xor >> 1;
        }
        return count;
    }
    public static void main(String[] args){
        HammingDistance obj = new HammingDistance();
        System.out.println(obj.hammingDistance(6,4));
    }
}
