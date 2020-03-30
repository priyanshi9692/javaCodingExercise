package StringProblems;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine){
        if(ransomNote==null || magazine==null){
            return true;
        }
        if(ransomNote.length()>magazine.length()){
            return false;
        }

        char[] magaArr = magazine.toCharArray();
        int[] countArray= new int[26];
        for(char c : magaArr){
            countArray[c-'a']++;
        }

        char [] ranArr= ransomNote.toCharArray();
        for(char c: ranArr){
            if(countArray[c-'a']>0){
                countArray[c-'a']--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        RansomNote obj =new RansomNote();
        System.out.println(obj.canConstruct("aab", "aabb"));
    }
}
