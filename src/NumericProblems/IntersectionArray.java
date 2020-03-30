package NumericProblems;

import java.util.HashSet;

public class IntersectionArray {
    public int [] intersectionArray(int [] nums1, int [] nums2){
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int i: nums1){
            set1.add(i);
        }

        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i: nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }

        int[] result = new int[set2.size()];
        int i=0;
        for(int n: set2){
            result[i++] = n;

        }
        for(int j=0; j<result.length; j++) {
            System.out.print(result[j]+ " ");
        }

        return result;
    }
    public static void main(String [] args){
        IntersectionArray obj= new IntersectionArray();
        int [] a={1,3,4,5,7};
        int [] b= {2,3,5,6};
        obj.intersectionArray(a,b);

        }
    }

