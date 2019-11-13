package ReverseString;
import java.util.*;

public class PalindromString {
    public boolean isPalindromString(String str){
        if(str.length()==0){
            return false;
        }
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]","");
        char[] arr= str.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            char temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        if(str.equals(new String(arr))){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        PalindromString p= new PalindromString();
        System.out.println(p.isPalindromString("a man, a plan, a canal: panama"));
    }
}
// Time Complexity: O(n) Space Complexity: O()