package HashMap;

import java.util.*;

public class Iterations {

    public static void main (String args[]){
        Map<String,Integer> map = new HashMap<>();

        map.put("A",5);
        map.put("B", 6);
        map.put("Z",3);
        map.put("C",7);
        map.put("D",1);

        map.forEach((k,v)->{
            System.out.println(k+ " " + v);
        });

        TreeMap<String,Integer> tmap= new TreeMap<>(map);


        tmap.forEach((k,v)->{
            System.out.println(k+ " " + v);
        });
        LinkedHashMap<String,Integer> sMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x-> sMap.put(x.getKey(),x.getValue()) );

        sMap.forEach((k,v) -> {
            System.out.println(k+ " " + v);
        });

        List<Integer> a = new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(5);
        a.add(7);
        a.add(4);

        a.forEach(k->{
            System.out.println(k);
        });

        Collections.sort(a);
        a.forEach(k->{
            System.out.println(k);
        });

        
        int[] a2 = new int[10];

        Arrays.sort(a2);






    }
}
