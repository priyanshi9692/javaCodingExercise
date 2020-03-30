package NumericProblems;

import java.util.HashMap;
import java.util.Map;

public class NumbersOfBoomerang {
    public int numberOfBoomerang(int [][] points){
        if(points== null || points.length==0 ){
            return 0;
        }
        Map<Integer, Integer> hmap =new HashMap<>();
        int noOfBoom=0;
        for(int i=0 ; i<points.length; i++){
            for(int j=0; j<points[0].length; j++){
                if(i==j){
                    continue;
                }
                    int dis = getDistance(points[i], points[j]);
                    hmap.put(dis, hmap.getOrDefault(dis,0)+1);
            }
            for(int val: hmap.values()){
                noOfBoom += val * (val-1);
            }
            hmap.clear();
        }

        return noOfBoom;
    }
    public int getDistance(int []pointA, int[] pointB){
        int disY= pointA[1]-pointB[1];
        int disX= pointA[0]-pointB[0];
        return disX * disX + disY * disY;
    }
    public static void main(String[] args){
        NumbersOfBoomerang obj =new NumbersOfBoomerang();
        int [][] Boomerang ={
                {0,0},
                {1,0},
                {2,0}
        };
        System.out.println(obj.numberOfBoomerang(Boomerang));
    }
}
