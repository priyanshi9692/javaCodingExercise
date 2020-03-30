package NumericProblems;

public class UnionArray {
    public void unionArray(int [] nums1, int [] nums2){
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                    System.out.print(nums1[i]+ " ");
                    i++;
            }
            else if(nums1[i]>nums2[j]){
                System.out.print(nums2[j]+" ");
                j++;
            }
            else{
                System.out.print(nums1[i]+" ");
                i++;
                j++;
            }
        }
        if(i<nums1.length){
            System.out.print(nums1[i]+" ");
            i++;
        }
        if(j<nums2.length){
            System.out.print(nums2[j]+" ");
            j++;
        }

    }
    public static void main(String [] args){
        UnionArray obj= new UnionArray();
        int [] a={1,3,4,5,7};
        int [] b={2,3,5,6};
        obj.unionArray(a,b);
    }
}
