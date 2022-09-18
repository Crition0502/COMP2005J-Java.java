package Week4;

public class Prime {
    public boolean isPrime(int number){
        if(number < 4){
            return true;
        }

        for(int i = 0 ; i < Math.sqrt(number) ; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
