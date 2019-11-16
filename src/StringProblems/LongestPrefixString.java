package StringProblems;

public class LongestPrefixString {

    public String longestCommonPrefix(String[] strs) {
            String result ="";
            if(strs.length == 0){
                return result;
            }
            if(strs.length == 1){
                return strs[0];
            }
            for(int i=1;i<strs.length;i++){
                if(i==1){
                    result= compare(strs[0],strs[1]);
                } else {
                    result = compare(result,strs[i]);
                }
            }
            return result;
        }
        public String compare(String s1, String s2){
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            int length = s1.length()>s2.length() ? s2.length() : s1.length();
            String result ="";
            for(int i=0;i<length;i++){
                if(c1[i] == c2[i]){
                    result+=c1[i];
                } else {
                    return result;
                }
            }
            return result;
        }
        public static void main(String[] args){
        String [] str={"flower","flow", "flown"};
        LongestPrefixString obj= new LongestPrefixString();
        System.out.println(obj.longestCommonPrefix(str));

        }
    }

