package StringProblems;
import java.util.HashMap;
public class CountWordsInString {
    public HashMap<String, Integer> countWords(String  str){
        if(str.length()==0){
            return null;
        }
        String lowerStr= str.toLowerCase();
        HashMap<String, Integer> hmap= new HashMap<>();
        String[] strSplit= lowerStr.split(" ");
        for(int i=0; i<strSplit.length; i++){
            if(hmap.containsKey(strSplit[i])){
                int count= hmap.get(strSplit[i]);
                hmap.put(strSplit[i], count+1);
            }
            else{
                hmap.put(strSplit[i], 1);
            }
        }
        return hmap;
    }
    public static void main(String [] args){
        CountWordsInString obj=new CountWordsInString();
        String str= "Priyanshi Jajoo is my official name and Charu Jajoo is my pet name";
        System.out.println(obj.countWords(str));
    }
}
