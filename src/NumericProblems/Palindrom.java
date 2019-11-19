package NumericProblems;

public class Palindrom {
    public boolean IsPalindrom(int num) {
        int sum = 0, rem;
        int a=num;
        while(num!=0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num =num / 10;
        }
        if (a == sum) {
            return true;
        }
        else
        return false;
    }
    public static void main(String[] args){
        Palindrom num= new Palindrom();
        System.out.println(num.IsPalindrom(1341));
    }
}
//time complexity: O(1) and Space Complexity: O(n)
