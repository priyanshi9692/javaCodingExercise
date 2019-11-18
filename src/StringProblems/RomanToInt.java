package StringProblems;

public class RomanToInt {
    public int romanToInt(String s) {
        if(s==null){
            return 0;
        }
        int num=0;

        for (int i=0; i<s.length(); i++)
        {
            int num1 = getValue(s.charAt(i));

            if (i+1 <s.length())
            {
                int num2 = getValue(s.charAt(i+1));

                if (num1 >= num2)
                {
                    num = num + num1;
                }
                else
                {
                    num = num + num2 - num1;
                    i++;
                }
            }
            else{
                num=num+num1;
            }

        }
        return num;
    }
    public int getValue(char s)
    {
        int num=0;
        switch(s){
            case 'I':
                num=1;
                break;
            case 'V':
                num=5;
                break;
            case 'X':
                num=10;
                break;
            case 'L':
                num=50;
                break;
            case 'C':
                num=100;
                break;
            case 'D':
                num=500;
                break;
            case 'M':
                num=1000;
                break;
        }
        return num;
    }
    public static void main(String [] args){
        RomanToInt str=new RomanToInt();
        System.out.println(str.romanToInt("XXVII"));
    }
}
//Time Complexity: O(n) Space Complexity: O(1)