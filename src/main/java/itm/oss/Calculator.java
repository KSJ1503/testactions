package itm.oss;

public class Calculator {
    public int add(int x, int y){
        return x + y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public boolean isPrime(int number){
        if(number<=1)
            return false;
        for(int i=2;i<number;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public int getNextPrime(int number){
        int index = number;
        while(true){
            index += 1;
            if(isPrime(index)){
                return index;
            }
        }
    }
}
