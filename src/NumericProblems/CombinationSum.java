package NumericProblems;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int [] candidates, int target){
        if(candidates==null || target==0){
            return null;
        }
        List<List<Integer>> result =new ArrayList<>();
        List<Integer> temp =new ArrayList<>();
        combination(candidates, 0, target, 0, temp, result);
        return result;
    }
   public void combination(int [] candidates, int start, int target, int sum, List<Integer> list, List<List<Integer>> result){
        if(sum>target){
            return ;
        }
        if(sum == target){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i= start; i<candidates.length; i++){
            list.add(candidates[i]);
            combination(candidates, i, target, sum+candidates[i], list, result);
            list.remove(list.size()-1);
        }
   }
   public static void main(String [] args){
        CombinationSum obj =new CombinationSum();
        int [] arr= {2,3,6,7};
        int target= 7;
        System.out.println(obj.combinationSum(arr, target));
   }
}
