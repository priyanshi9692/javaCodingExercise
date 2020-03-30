package NumericProblems;

public class BrokenCalculator {
    public int calculateOperations(int num, int target){
        int min= Integer.MAX_VALUE;
        int count;
        for(int i= num; i>0; i--){
            count =num-i;
            int var=i;
            while(target>var){
                count++;
                var=var*2;
                if(var==target){
                break;
                }
            }
            count = count+(var-target);
            min = min>count ? count :min;
        }

        return min;
    }
    public static void main(String [] args){
        BrokenCalculator obj =new BrokenCalculator();
        int num=4;
        int target=6;
        System.out.println(obj.calculateOperations(num,target));
    }
}
