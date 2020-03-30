package NumericProblems;

public class PizzaParty {
    public boolean discountOfferUse(int [] days){
        if(days==null || days.length==0){
            return false;
        }
        int carryCount=0;
        for(int i=0; i<days.length; i++){
            if(days[i]==0 && carryCount==1){
                return false;
            }
            if(days[i]%2 !=0){
                if(carryCount==1){
                    carryCount=0;
                }
                else{
                    carryCount=1;
                }
            }
        }
        if(carryCount==1){
            return false;
        }
        return true;
    }
    public static void main(String [] args){
        PizzaParty obj= new PizzaParty();
        int [] arr = {1,2,1,4,7,5};
        System.out.println(obj.discountOfferUse(arr));
    }
}
