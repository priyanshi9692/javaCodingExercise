package StringProblems;

import java.util.HashMap;

public class RepetitiveString {
    public HashMap<String, Integer> repetitiveString(String [] str){

        if(str.length==0 || str.length==1){
            return null;
        }
        HashMap <String, Integer> hmap= new HashMap<>();
        for(int i=0; i<str.length; i++){
            if(hmap.containsKey(str[i])){
              hmap.put(str[i],hmap.get(str[i])+1) ;
            }
            else{
                hmap.put(str[i],1);
            }
        }
        return hmap;

    }
    public static void main(String [] args){
        RepetitiveString obj=new RepetitiveString();
        String [] str={"Hello", "Priyanshi", "Hello", "Charu", "Hello", "World", "Priyanshi", "World"};
        System.out.println(obj.repetitiveString(str));
    }

}
