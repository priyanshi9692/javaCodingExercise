package NumericProblems;

import java.util.Arrays;

// 274 H-Index
//Given an array of citations (each citation is a non-negative integer) of a researcher,
// write a function to compute the researcher's h-index.
//
//        According to the definition of h-index on Wikipedia: "A scientist has index h if h of
//        his/her N papers have at least h citations each, and the other N − h papers
//        have no more than h citations each."
//
//        Example:
//
//        Input: citations = [3,0,6,1,5]
//        Output: 3
//        Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had
//        received 3, 0, 6, 1, 5 citations respectively.
//        Since the researcher has 3 papers with at least 3 citations each and the remaining
//        two with no more than 3 citations each, her h-index is 3.
public class HIndex {
    public int hIndex(int [] citations ){
        Arrays.sort(citations);
        int result = 0;
        for(int i = citations.length-1; i>=0; i--){
            int count = citations.length-i;
            if(citations[i]>=count){
                result = count;
            }else{
                break;
            }
        }
        return result;
    }
    public static void main(String[] args){
        HIndex obj = new HIndex();
        int [] citations = {3,0,6,1,5};
        System.out.println(obj.hIndex(citations));
    }

}
