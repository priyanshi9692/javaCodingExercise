package NumericProblems;

public class MultipleOfThreeAndFive {
    public int multipleOfThreeAndFive(int num){
//        if(n>1000){
//            return 0;
//        }
        int n = 0;
        int sum = 0;
        while(n<num){
            if(n%3==0 || n%5==0){
//                System.out.print("Number: "+n);
                sum+= n;

            }
            n++;
        }
        return sum;
    }
    public static void main(String[] args){
        MultipleOfThreeAndFive obj = new MultipleOfThreeAndFive();
        System.out.println(obj.multipleOfThreeAndFive(1000));
    }
}
