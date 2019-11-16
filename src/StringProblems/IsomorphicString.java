package StringProblems;
import java.util.HashMap;

public class IsomorphicString {
    public boolean isIsomorphicStr(String s, String t){
        if(s.length()!=t.length() || s==null || t==null){
            return false;
        }
            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();
            HashMap<Character, Character> hmap = new HashMap<Character, Character>();
            for (int i = 0; i < s1.length; i++) {
                if (hmap.containsKey(s1[i])) {
                    if (hmap.get(s1[i]) == t1[i]) {
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    if(hmap.containsValue(t1[i])){
                        return false;
                    }
                    hmap.put(s1[i], t1[i]);
                }

            }
            return true;
    }
        public static void main(String[] args){
            IsomorphicString str= new IsomorphicString();
            System.out.println(str.isIsomorphicStr("eggf", "adda"));

        }
}
// Time complexity: O(n) and Space complexity: O(1)
