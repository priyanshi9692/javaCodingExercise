package NumericProblems;

import java.util.ArrayList;
import java.util.List;

/*
Given weights : [1.99, 1.01, 2.5, 1.5, 1.01]
Maximum bag size is 3.0 find the minimum number trips required by the janitor to dump the garbage.
Output for the example :
[1.01 + 1.99], [1.01 + 1.5], [2.5] so min steps is 3.
 */
public class EfficientJanitor {
    public int efficientJanitor(List<Double> weights){
        if(weights == null || weights.size()==0){
            return 0;
        }
        int start = 0;
        int end = weights.size()-1;
        int trips = 0;
        while(start<=end){
            if(weights.get(start)+weights.get(end)<=3.00){
                start ++;
            }
            end--;
            trips ++;
        }
        return trips;
    }
    public static void main(String[] args){
        EfficientJanitor obj = new EfficientJanitor();
        List<Double> list = new ArrayList<>();
        list.add(1.99);
        list.add(1.01);
        list.add(2.5);
        list.add(1.5);
        list.add(1.01);
        System.out.println(obj.efficientJanitor(list));
    }
}
