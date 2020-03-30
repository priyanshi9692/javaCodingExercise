package NumericProblems;

public class UglyNum {
    public boolean uglyNum(int num){
        if(num==0){
            return false;
        }
        if(num==1){
            return true;
        }
        if(num%2==0){
            num/=2;
            return uglyNum(num);
        }
        if(num%3==0){
            num/=3;
            return uglyNum(num);
        }
        if(num%5==0){
            num/=5;
            return uglyNum(num);
        }
    return false;
    }
    public static void main(String[] args){
        UglyNum obj =new UglyNum();
        System.out.println(obj.uglyNum(14));
    }
}
