package se.kth.iv1350.inheritancecomposition.inheritance;
import java.util.Random;

/**
 * Includes a specific type of random generator
 */
public class CheatRandom extends Random {
    private int counterCheater;

    public CheatRandom(){
        super();
        this.counterCheater = 0;
    }

    /**
     * Generates a random number which after the tenth method call returns a guaranteed value that is bound-1.
     * @param bound The upper bound 
     * @return The generated random number
     */
    @Override
    public int nextInt(int bound){
        int result = super.nextInt(bound); 
        counterCheater++;
        if(counterCheater%10 == 0){
            return bound - 1;
        }else{
            return result;
        }


    }


}
