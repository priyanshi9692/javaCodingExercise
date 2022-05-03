package NumericProblems;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfNumbers {
    public List<Integer> listNum(int start, int end){
        List<Integer> result = new ArrayList<>();
        int factor = start;
        int num = start;
        while(start<=end){
            if(num<=end){
                if(num%factor == 0 || num%end==0){
                    result.add(num);
                }
                num = num+1;
                start++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        FactorsOfNumbers obj = new FactorsOfNumbers();
        List<Integer> list = new ArrayList<>();
        list = obj.listNum(3,18);
        for(int num: list){
            System.out.println(num);
        }
    }
}
