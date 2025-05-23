package se.kth.iv1350.inheritancecomposition.inheritance;

import java.util.Random;
public class DiceCollectionInheritence extends Random{

    private final int d4Bound = 4;
    private final int d6Bound = 6;
    private final int d8Bound = 8;

    private final int d10Bound = 10;
    private final int d12Bound = 12;
    private final int d20Bound = 20;

    
    /**
     * An enum representing available die types.
     */
    enum DiceType{
        D4,
        D6,
        D8,
        D10,
        D12,
        D20
    }

    public DiceCollectionInheritence(){

    }

        /**
     * The function of rolling a die.
     * @param diceType A string selecting the dice type to be rolled.
     */
    public void rollTheDice(String diceType){
        
    }



    private boolean isDiceTypeValid(String diceType){
        try{
            DiceType.valueOf(diceType.toUpperCase()); 
            return true;
        }catch(IllegalArgumentException e){
            return false;
        }
    }


    
    
}
