package NumericProblems;

public class AddWithoutOp {
    public int addWithoutOp(int a, int b){
        while(b!=0){
            int carry= a & b;
            a= a ^ b;
            b= carry<<1;
        }
        return a;
    }
    public static void main(String [] args){
        AddWithoutOp obj=new AddWithoutOp();
        System.out.println(obj.addWithoutOp(1,2));
    }
}
