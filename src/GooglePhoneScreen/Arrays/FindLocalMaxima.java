package GooglePhoneScreen.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindLocalMaxima {
    public static List<Integer> localMaxima(int[] values){
        if(values == null || values.length == 0){
            return null;
        }
        List<Integer> result = new ArrayList<>();
        if(values.length == 1){
            result.add(values[0]);
            return result;
        }
        HashSet<Integer> set = new HashSet<>();

        for(int num: values){
            set.add(num);
        }

        if(set.size() == 1){
            result.add(values[0]);
            return result;
        }

        for(int i = 0; i<values.length-1; i++){
                if(i> 0 && values[i-1] < values[i]  && values[i]>=values[i+1]){
                    result.add(values[i]);
                }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(localMaxima(new int[]{1,2,1}));
        System.out.println(localMaxima(new int[]{1,2,3,4,2,3,2,1}));
        System.out.println(localMaxima(new int[]{1,2,4,2,5,1}));
        System.out.println(localMaxima(new int[]{-1,-1}));
        System.out.println(localMaxima(new int[]{4}));
        System.out.println(localMaxima(new int[]{0,0,1,1,0,1,0}));
        System.out.println(localMaxima(new int[]{5,4,3,2,1}));
    }
}
