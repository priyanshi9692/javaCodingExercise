package NumericProblems;
/*
Alternative Number Problem
 */
public class AlternativeNumberReturn {
    public long alternateNumber(long num){
        String str = Long.toString(num);
        int k = 0;
        int j = str.length()-1;
        char[] ch = new char[str.length()];
        for(int i = 0; i<str.length(); i++){
            if(i%2==0){
                ch[i] = str.charAt(k);
                k++;
            }else{
                ch[i]=str.charAt(j);
                j--;
            }
        }
        String result =  new String(ch);
        return Long.parseLong(result);
    }
    public static void main(String[] args){
        AlternativeNumberReturn obj = new AlternativeNumberReturn();
        long n = 130;
        System.out.println(obj.alternateNumber(n));
    }
}
