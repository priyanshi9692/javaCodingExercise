package StringProblems;
import java.util.ArrayList;
public class RemoveDuplicatesCharacters {
    public void removeConsecutiveCharacters(char [] c){
     if(c.length==0){
         System.out.println("Not possible");
     }
     ArrayList<Character> charArray= new ArrayList<>();
     char prev= '0';
     for(int i=0; i<c.length-1; i++){

         if(c[i]!=c[i+1]){
             if(prev!=c[i])
             charArray.add(c[i]);
             if(i+1==c.length-1){
                 charArray.add(c[i+1]);
             }
         }
         else{
                prev = c[i];
         }
     }
     System.out.println(charArray);
    }
    public static void main(String [] args){
        RemoveDuplicatesCharacters obj = new RemoveDuplicatesCharacters();
        String str= "aaabcccddeffghiij";
        char [] c =str.toCharArray();
        obj.removeConsecutiveCharacters(c);
    }
}
