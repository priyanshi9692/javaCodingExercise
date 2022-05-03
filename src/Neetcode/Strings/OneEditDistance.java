package Neetcode.Strings;

public class OneEditDistance {
    public static boolean oneEditDistance(String s, String t){
        int lenS = s.length();
        int lenT = t.length();
        if(Math.abs(lenS-lenT)>1){
            return false;
        }
        int count = 0;
        int i = 0;
        int j = 0;
        while(i<lenS && j<lenT){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else {
                count++;
                if(count>1){
                    return false;
                }else if(lenS>lenT){
                    i++;
                }else if(lenS<lenT){
                    j++;
                }else {
                    i++;
                    j++;
                }
            }
        }

        if(i<lenS || j<lenT){
            count++;
        }
        if(count == 1){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println("One Edit Distance is possible: "+ oneEditDistance("ab", "acb"));
    }
}
