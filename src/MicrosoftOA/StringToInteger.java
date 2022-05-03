package MicrosoftOA;

public class StringToInteger {
    public static int stringToInteger(String num){
        int digit = 0;
        boolean isNegative = false;
        int j=0;
        if(num.charAt(0) == '-'){
            isNegative = true;
            j=1;
        }
            for( int i=j; i<num.length(); i++){

                digit= digit*10;
                digit+= num.charAt(i)-'0';
            }

        return isNegative ? (-1*digit) : digit;
    }
    public static void main(String [] args){
        System.out.println(stringToInteger("42"));
        System.out.println(stringToInteger("-42"));
    }
}
