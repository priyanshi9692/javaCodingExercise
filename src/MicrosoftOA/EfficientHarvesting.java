package MicrosoftOA;
/*
Circular Array + Sliding window problem
 */
public class EfficientHarvesting {
    public static int maxProfitEfficientHarvest(int[] fields, int k ){
        int totalMax = 0;
        int half = fields.length/2;
        for(int i = 0; i<k; i++){
            totalMax+= fields[i]+fields[(i+half)%fields.length];
        }

        int max = totalMax;

        // sliding window approach
        for(int i = 1; i<half; i++){
            max-= fields[i-1];
            max-=fields[(i-1+half)%fields.length];
            max+= fields[i+k-1];
            max+= fields[(i+k-1+half)%fields.length];

            totalMax = Math.max(max, totalMax);
        }
        return totalMax;
    }

    public static void main(String[] args){
        int[] fields = {7,3,1,5,1,-3};
        int[] fields1 = {6,3,-6,-3};
        System.out.println("Maximum profit: "+maxProfitEfficientHarvest(fields, 2));
        System.out.println("Maximum profit: "+maxProfitEfficientHarvest(fields1, 1));

    }
}
