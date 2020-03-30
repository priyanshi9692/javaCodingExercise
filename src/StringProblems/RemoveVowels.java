package StringProblems;

public class RemoveVowels {
    public String removeVowels(String str){
        if(str.length()==0){
            return null;
        }
        return str.replaceAll("[aeiouAEIOU]", "");
    }
    public static void main(String [] args){
        RemoveVowels obj= new RemoveVowels();
        System.out.println(obj.removeVowels("Priyanshi Jajoo Piyush Mantri"));
    }
}
