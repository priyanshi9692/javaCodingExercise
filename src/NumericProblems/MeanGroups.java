package NumericProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MeanGroups {
public static List<List<Integer>> meanGroups(int[][] a){
  List<List<Integer>>  result = new ArrayList<>();

    float [] mean = new float[a.length];
  HashMap<Float,List<Integer>> map = new HashMap<>();
  for(int i=0; i<a.length; i++){
      float sum =0;
    for(int j =0; j<a[i].length; j++){
        sum+=a[i][j];
    }

      mean[i] = sum/(a[i].length);
      System.out.println(mean[i]);
    if(map.containsKey(mean[i])){
        map.get(mean[i]);
        List<Integer> list2 = map.get(mean[i]);
        list2.add(i);
        map.put(mean[i],list2);
    } else {
        List<Integer> list2 = new ArrayList<>();
        //list2 = map.get(mean[i]);
        list2.add(i);
        map.put(mean[i],list2);
    }
  }


  map.forEach((k,v)-> {
      result.add(v);
    });

  return result;
}
public static void main(String[] args){
    int[][] grid = {
            {3,3,4,2},
            {4,4},
            {4,0,3,3},
            {2,3},
            {3,3,3}
    };
    List<List<Integer>>  result = meanGroups(grid);
    result.forEach(k->{
        System.out.println(k);
    });
}
}
