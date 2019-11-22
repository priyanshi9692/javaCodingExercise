package StringProblems;

public class LengthOfLastString {
    public int lengthOfLastWord(String s) {
        if(s==null || s.length() == 0)
            return 0;

        int length = 0;
        int len = s.length();

        boolean flag = false;
        for(int i=len-1; i>=0; i--){
            char c = s.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')){
                flag = true;
                length++;
            }else{
                if(flag)
                    return length;
            }
        }

        return length;
    }
    public static void main(String[] args){
        LengthOfLastString num= new LengthOfLastString();
        System.out.println("Output: "+ num.lengthOfLastWord("I am Priyanshi Jajoo and I am in Class CMPE202"));
    }

}
