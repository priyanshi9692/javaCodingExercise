package NumericProblems;

public class MergeSortedArray {
    public void mergeSortedArray(int [] nums1, int[] nums2, int m, int n){
        if(nums1==null || nums2==null){
            return;
        }
        while(m>0 && n>0){
            if(nums1[m-1]>nums2[n-1]){
                nums1[m+n-1]=nums1[m-1];
                m--;
            }else{
                nums1[m+n-1]=nums2[n-1];
                n--;
            }
        }
        while(n>0){
            nums1[m+n-1]=nums2[n-1];
            n--;
        }
    }
    public static void  main(String [] args){
        MergeSortedArray obj= new MergeSortedArray();
        int [] A={1,2,3,0,0,0};
        int [] B ={4,5,6};
        int m= 3;
        int n=3;
        obj.mergeSortedArray(A,B,m,n);
        for(int i=0 ; i<m+n; i++){
            System.out.print(A[i]+ "\t");
        }
    }

}
