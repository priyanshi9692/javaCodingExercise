package NumericProblems;

public class ConcatenateSum {
    public static int concatenateSum(int[] a){
     int sum=0;
        for(int i =0; i<a.length; i++){
            String str = "";
            for(int j=0; j<a.length; j++){

                str = Integer.toString(a[i])+Integer.toString(a[j]);
                sum += Integer.parseInt(str);
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int [] a= {10,2};
        System.out.println(concatenateSum(a));
    }
}
