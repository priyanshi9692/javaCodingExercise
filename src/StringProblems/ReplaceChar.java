package StringProblems;

public class ReplaceChar {

    public static void main(String[] args){
        ReplaceChar r= new ReplaceChar();
        System.out.println(r.replaceCharacter("priyanshi", 4, 'e'));
    }

    public String replaceCharacter(String str, int pos, char replacement){
        if(str.length()==0){
            return null;
        }
        char[] a = str.toCharArray();
        for(int i=0; i<a.length; i++){
            if(i==pos){
                a[i]=replacement;
                break;
            }
            else{
                continue;
            }
        }

        return new String(a);
    }

}
//Time Complexity: O(n) Space Complexity: O(n)