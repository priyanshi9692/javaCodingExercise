package NumericProblems;

public class Sqrt {
    public int sqrtFunction(int num){
        if(num==0 || num==1){
            return num;
        }
        int i=1;
        int result=1;
        while(result<=num){
            i++;
            result=i*i;
        }
        return i-1;

    }
    public static void main(String[] args){
        Sqrt num=new Sqrt();
        System.out.println(num.sqrtFunction(484));
    }
}
