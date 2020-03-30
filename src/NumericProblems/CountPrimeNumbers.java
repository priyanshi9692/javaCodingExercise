package NumericProblems;

public class CountPrimeNumbers {
    public int countPrimeNumber(int num){

        if(num<=2){
            return 0;
        }
        boolean[] prime = new boolean[num];
        for(int i=2; i<num; i++){
            prime[i]=true;
        }
        for(int i=2; i< Math.sqrt(num-1); i++){
            if(prime[i]){
                    for(int j=i+i; j<num ; j+=i){
                        prime[j]=false;
                    }
                }
        }
        int count=0;
        for(int i=2; i<num ; i++){
            if(prime[i]){
                count ++;
            }
        }
        return count;
    }
    public static void main(String [] args){
        CountPrimeNumbers obj =new CountPrimeNumbers();
        System.out.println(obj.countPrimeNumber(15));
    }
}












