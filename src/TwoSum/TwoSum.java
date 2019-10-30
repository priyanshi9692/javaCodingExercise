package TwoSum;
import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {
    public int[] twoSum(int[] a, int t){
    if(a.length==0 && a.length<2){
        return new int[] {0,0};
    }
    HashMap<Integer, Integer> hmap= new HashMap<>();
    for(int i=0; i<a.length; i++)
    if(hmap.containsKey(a[i])){
       return new int[]{hmap.get(a[i]),i} ;
    }
    else{
        hmap.put(t-a[i],i);
    }
    return new int[] {0,0};
    }
    public static void main(String[] args){
        TwoSum t= new TwoSum();
        int[] b={6,-5,5,7};
        System.out.println((Arrays.toString(t.twoSum(b, 0))));
    }

}
